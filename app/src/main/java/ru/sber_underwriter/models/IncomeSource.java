package ru.sber_underwriter.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name="income_source")
public class IncomeSource {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client clientId;

    @Column(name = "sum")
    private BigDecimal sum;
    @Column(name = "income_type")
    @Enumerated
    private IncomeType incomeType;
    @Column(name = "is_docs_ok")
    private boolean isDocsOk;
    @Column(name = "work_term")
    private LocalDate workTerm;
    @Column(name = "is_main")
    private boolean isMain;
    @Column(name = "position")
    private String position;


    public IncomeSource() {
    }
    
    public int getId () {
        return id;
    }
    public Client getClientId () {
        return clientId;
    }
    public BigDecimal getSum() {
        return sum;
    }
    public IncomeType getIncomeType () {
         return incomeType;
     }
    public boolean getIsDocsOk () {
        return isDocsOk;
    }
    public LocalDate getWorkTerm () {
        return workTerm;
    }
    public boolean getIsMain() {
        return isMain;
    }
    public String getPosition() {
        return position;
    }
}
