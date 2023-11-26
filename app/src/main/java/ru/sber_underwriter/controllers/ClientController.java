package ru.sber_underwriter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.sber_underwriter.services.ClientService;
import ru.sber_underwriter.models.Client;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Получение списка всех клиентов
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = (List<Client>) clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    // Получение информации о конкретном клиенте по ID
    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClientById(@PathVariable int clientId) {
        Optional<Client> optionalClient = clientService.getClientById(clientId);
        
        if (optionalClient.isPresent()) {
            return new ResponseEntity<>(optionalClient.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Создание нового клиента
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client newClient) {
        Client createdClient = clientService.saveClient(newClient);
        return new ResponseEntity<>(createdClient, HttpStatus.CREATED);
    }

    // Обновление информации о клиенте
    // @PutMapping("/{clientId}")
    // public ResponseEntity<Client> updateClient(@PathVariable int clientId, @RequestBody Client updatedClient) {
    //     Client client = clientService.updateClient(clientId, updatedClient);
    //     if (client != null) {
    //         return new ResponseEntity<>(client, HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    // }

    // Удаление клиента
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable Client clientId) {
        clientService.deleteClient(clientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 
    }
}
