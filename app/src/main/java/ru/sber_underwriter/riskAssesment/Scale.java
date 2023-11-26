package ru.sber_underwriter.riskAssesment;

public interface Scale<ValueType> {
    public int getPointsByValue(ValueType type);
}
