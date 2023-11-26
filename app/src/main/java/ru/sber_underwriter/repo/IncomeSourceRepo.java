package ru.sber_underwriter.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import ru.sber_underwriter.models.Client;
import ru.sber_underwriter.models.IncomeSource;

public interface IncomeSourceRepo extends CrudRepository<IncomeSource, Integer> {
    ArrayList<IncomeSource> getIncomeSourceByClientId (Client client);
}
