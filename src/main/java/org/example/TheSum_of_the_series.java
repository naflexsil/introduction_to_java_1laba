package org.example;

public class TheSum_of_the_series {
    // вычисл-е члена ряда
    public static double calculateTerm(int n) {
        return 1.0 / (n * n + n - 2);
    }

    // вычисл-е суммы ряда до заданного кол-ва итераций
    public static double sumSeries(double threshold) {
        double sum = 0.0;
        int n = 2;
        double term;

        // продолжаем, пока член ряда > порогового знач-я
        while ((term = calculateTerm(n)) >= threshold) {
            sum += term;
            n++;
        }
        return sum;
    }

    public static void main(String[] args) {
        double threshold = 1e-6;  // порог для остановки вычисл-я
        double result = sumSeries(threshold);
        System.out.println("the sum of the series up to " + threshold + ": " + result);
    }
}
