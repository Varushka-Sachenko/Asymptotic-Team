package ru.sber_underwriter.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.sber_underwriter.models.Client;
import ru.sber_underwriter.repo.ClientRepo;

@Service
public class ClientService {
    private final ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public Iterable<Client> getAllClients () {
        return clientRepo.findAll();
    }

    public Optional<Client> getClientById(int clientId) {
        return clientRepo.findById(clientId);
    }

    public Client saveClient (Client client) {
        return clientRepo.save(client);
    }

    public void deleteClient (Client client) {
        clientRepo.delete(client);
    }

    public void updateDSTI (int clientId) {
        Optional<Client> optionalClient = getClientById(clientId);
        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            LocalDate date = LocalDate.now();
            Period period = client.getRequestDateForDSTI().until(date);
        
        if (period.getDays() > 5) {
            client.setDSTI(getNewDSTI());
            client.setRequestDateForDSTI(LocalDate.now());
        }
        }
        
    }

    public BigDecimal getNewDSTI () {
        return new BigDecimal(50); // исправить
    }

}
