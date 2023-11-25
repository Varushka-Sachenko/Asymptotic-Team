package ru.sber_underwriter.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class IncomeSource {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client cliendId;

    private BigDecimal sum;
    private IncomeType incomeType;
    private boolean isDocsOk;
    private LocalDate workTerm;
    private boolean isMain;
    private String position;
    public IncomeSource() {
    }
}
