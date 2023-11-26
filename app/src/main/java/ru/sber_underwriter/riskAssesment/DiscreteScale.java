package ru.sber_underwriter.riskAssesment;

public class DiscreteScale<ValueType extends Enum> implements Scale<ValueType>   {

    int points[];

    @Override
    public int getPointsByValue(ValueType value) {
        return points[value.ordinal()];
    }
}
