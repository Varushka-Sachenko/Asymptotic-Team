package ru.sber_underwriter.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.sber_underwriter.repo.ObligationsRepo;
import ru.sber_underwriter.models.Obligations;
import ru.sber_underwriter.models.Client;


@Service
public class ObligationsService {
    private final ObligationsRepo obligationsRepo;

    @Autowired
    public ObligationsService (ObligationsRepo obligationsRepo) {
        this.obligationsRepo = obligationsRepo;
    }

    public Optional<Obligations> getObligationsById (int id) {
        return obligationsRepo.findById(id);
    }

    public Obligations saveObligations (Obligations obligations) {
        return obligationsRepo.save(obligations);
    }

    public void deleteObligations (Obligations obligations) {
        obligationsRepo.delete(obligations);
    }

    public void updateBKI (Client client) {
        ArrayList<Obligations> listObligations = obligationsRepo.getObligationsByClientId(client);
        for (Obligations obligation : listObligations) {
            LocalDate date = LocalDate.now();
            Period period = obligation.getRequesDate().until(date);
            if (period.getDays() > 15) {
                requestNewBKSI(obligation);
                obligation.setRequestDate(LocalDate.now());
            }
        }
    }

    private void requestNewBKSI (Obligations obligations) {
        obligations = new Obligations(); // как-то получаем новый БКИ
    }
}
