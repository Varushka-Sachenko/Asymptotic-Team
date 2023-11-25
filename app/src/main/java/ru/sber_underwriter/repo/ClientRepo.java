package ru.sber_underwriter.repo;

import org.springframework.data.repository.CrudRepository;
import ru.sber_underwriter.models.Client;
import ru.sber_underwriter.models.IncomeSource;
//import ru.sber_underwriter.models.Obligations;

import java.util.ArrayList;

public interface ClientRepo extends CrudRepository<Client, Integer> {
    Client getClientById (int id);
}
