package ru.sber_underwriter.riskAssesment;

import java.math.BigDecimal;
import java.util.Arrays;

public class ContScale implements Scale<BigDecimal> {
    int[] points;  // {5, 1, 3, 10}
    BigDecimal[] values; // {25, 55, 74} - верхняя грань для points[i] (включительно)

    public int getPointsByValue(BigDecimal val) {
        int i = Arrays.binarySearch(values, val);
        if (i < 0)
            i = -i - 1;
        return points[i];        
    }
}
