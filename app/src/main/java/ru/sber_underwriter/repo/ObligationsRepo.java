package ru.sber_underwriter.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import ru.sber_underwriter.models.Client;
import ru.sber_underwriter.models.IncomeSource;
import ru.sber_underwriter.models.Obligations;

public interface ObligationsRepo extends CrudRepository<Obligations, Integer>{
       ArrayList<Obligations> getObligationsByClientId (Client client);
}
