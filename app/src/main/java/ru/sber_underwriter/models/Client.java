package ru.sber_underwriter.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "city")
    private String city;
    @Enumerated
    private MaritalStatus maritalStatus;
    @Column(name = "children_amount")
    private int childrenAmount;
    @Enumerated
    private Role role;
    @Column(name = "dsti") // пнд
    private BigDecimal DSTI;
    @Column(name = "request_data_for_dsti")
    private LocalDate requestDateForDSTI;
    @Column(name = "is_client_of_the_bank")
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

    public boolean getClientOfTheBank() {
        return isClientOfTheBank;
    }

    public LocalDate getRequestDateForDSTI () {
        return requestDateForDSTI;
    }


}
