package ru.sber_underwriter.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Obligations {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client cliendId;

    private String obligationsTypes;
    private LocalDate prevDebtsTimeOpen;
    private LocalDate prevDebtsTimePlanClose;
    private LocalDate prevDebtsTimeClose;

    private Role role;
    private boolean status;
    private BigDecimal sum;
    private double interestRate;
    private BigDecimal remainsValue;
    private BigDecimal delayAmount;

    public Obligations() {}

}


