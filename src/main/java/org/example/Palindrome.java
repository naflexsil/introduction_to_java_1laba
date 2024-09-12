package org.example;

import java.util.Scanner;

public class Palindrome {
    String input = "radar";  // Пример строки
    boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
        System.out.println("Строка \"" + input + "\" является палиндромом.");
    } else {
        System.out.println("Строка \"" + input + "\" не является палиндромом.");
    }
}

// Функция для проверки строки на палиндром
public static boolean checkPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        // Пропускаем пробелы и символы, которые не являются буквами (если необходимо)
        while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
            right--;
        }

        // Сравниваем символы
        if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
            return false;  // Если символы не совпадают, строка не палиндром
        }

        left++;
        right--;
    }

    return true;  // Строка палиндром
}