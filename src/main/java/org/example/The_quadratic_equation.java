package org.example;

import java.util.Scanner;

public class The_quadratic_equation {
    public static void main(String[] args) {
        // Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        String result = findRoots(a, b, c);
        System.out.println(result);
    }

    public static String findRoots(double a, double b, double c) {
        // D
        double discriminant = b * b - 4 * a * c;

        // если D < 0
        if (discriminant < 0) {
            return "there are no real roots";
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);
        double x1 = (-b + sqrtDiscriminant) / (2 * a);
        double x2 = (-b - sqrtDiscriminant) / (2 * a);

        // "D = 0" => корень один
        if (discriminant == 0) {
            return "x = " + x1;
        }

        // возвращает два корня
        return "x1 = " + x1 + ", x2 = " + x2;
    }
}