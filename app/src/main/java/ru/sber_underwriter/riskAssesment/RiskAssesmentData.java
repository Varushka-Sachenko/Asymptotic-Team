package ru.sber_underwriter.riskAssesment;

import java.math.BigDecimal;

import lombok.Getter;
import ru.sber_underwriter.models.CreditHistoryQuality;
import ru.sber_underwriter.models.IncomeType;
import ru.sber_underwriter.models.MaritalStatus;

@Getter
public class RiskAssesmentData {
    int age;
    MaritalStatus maritalStatus;
    int children; // {5, 3}, {0}
    CreditHistoryQuality creditHistoryQuality;
    IncomeType incomeType;
    int experiance; // стаж
    BigDecimal DSTI;
    BigDecimal income;
    int isClientOfTheBank; // {1, 5} {0}
}
