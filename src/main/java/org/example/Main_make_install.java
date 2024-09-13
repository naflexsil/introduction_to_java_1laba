package org.example;

public class Main_make_install {
    public static void main(String[] args) {
        String original = "make install";

        System.out.println(reverseString(original));
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // проходит по строке с конца и добавляет символы в reversed
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}