package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheSum_of_the_seriesTest {
    @Test
    public void testCalculateTerm() {
        // проверка вычисл-я конкретного члена ряда для n = 2
        assertEquals(0.25, TheSum_of_the_series.calculateTerm(2), 0.00001);
    }

    @Test
    public void testSumSeries() {
        // Проверка вычисления суммы ряда с порогом 1e-6
        double threshold = 1e-6;
        double expectedSum = 0.610111;  // Ожидаемая сумма, найденная численно
        assertEquals(expectedSum, TheSum_of_the_series.sumSeries(threshold), 0.000001);
    }
}