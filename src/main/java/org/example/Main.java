package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }
}


