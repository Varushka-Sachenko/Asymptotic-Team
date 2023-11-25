package ru.sber_underwriter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Client {
    @Id
    private int id;
    private LocalDate birthDate;
    private String city;
    private MaritalStatus maritalStatus;
    private int childrenAmount;
    private Role role;
    private BigDecimal DSTI;
    private boolean isClientOfTheBank;

    public Client() {}

    public int getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCity() {
        return city;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public int getChildrenAmount() {
        return childrenAmount;
    }

    public Role getRole() {
        return role;
    }

    public BigDecimal getDSTI() {
        return DSTI;
    }


}
