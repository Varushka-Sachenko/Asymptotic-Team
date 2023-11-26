package ru.sber_underwriter.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

public enum IncomeType {
    SALARY,
    ENTREPRENEURSHIP,
    PENSION,
    OTHER
}
