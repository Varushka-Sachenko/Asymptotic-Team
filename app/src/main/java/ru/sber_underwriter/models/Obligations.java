package ru.sber_underwriter.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Obligations {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client clientId;
    private String obligationsTypes;
    private LocalDate prevDebtsTimeOpen;
    private LocalDate prevDebtsTimePlanClose;
    private LocalDate prevDebtsTimeClose;
    private Role role;
    private boolean status;
    private BigDecimal sum;
    private double interestRate; // процентная ставка
    private BigDecimal remainsValue; // остаток к выплате
    private BigDecimal delayAmount; // сумма просрочки
    private LocalDate requestDate;

    public Obligations() {}

    public String getobligationsTypes () {
        return obligationsTypes;
    }
    public LocalDate getPrevDebtsTimeOpen () {
        return prevDebtsTimeOpen;
    }
    public LocalDate getPrevDebtsTimePlanClose () {
        return prevDebtsTimePlanClose;
    }
    public LocalDate getPrevDebtsTimeClose () {
        return prevDebtsTimeClose;
    }
    public Role getRole () {
        return role;
    }
    public boolean getStatus () {
        return status;
    }
    public BigDecimal getSum () {
        return sum;
    }
    public double getInterestRate () {
        return interestRate;
    }
    public BigDecimal getRemainsValue () {
        return remainsValue;
    }
    public BigDecimal getDelayAmount () {
        return delayAmount;
    }
    public LocalDate getRequesDate () {
        return requestDate;
    }

}


