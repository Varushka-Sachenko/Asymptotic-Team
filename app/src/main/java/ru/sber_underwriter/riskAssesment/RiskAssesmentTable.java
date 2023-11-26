package ru.sber_underwriter.riskAssesment;

import ru.sber_underwriter.models.CreditHistoryQuality;
import ru.sber_underwriter.models.IncomeType;
import ru.sber_underwriter.models.MaritalStatus;

public class RiskAssesmentTable {
    ContScale ageScale;
    DiscreteScale<MaritalStatus> maritalStatusScale;
    ContScale childrenScale; // {5, 3}, {0}
    DiscreteScale<CreditHistoryQuality> creditHistoryQualityScale;
    DiscreteScale<IncomeType> incomeTypeScale;
    ContScale experianceScale; // стаж
    ContScale DSTIScale;
    ContScale incomeScale;
    ContScale isClientOfTheBankScale; // {1, 5} {0}



}
