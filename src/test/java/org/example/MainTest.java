package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void testFizzBuzz() {
        // должны вернуть "fizzbuzz"
        assertEquals("fizzbuzz", Main.fizzBuzz(35));
        // должны вернуть "fizz"
        assertEquals("fizz", Main.fizzBuzz(10));

        // должны вернуть "buzz"
        assertEquals("buzz", Main.fizzBuzz(14));

        // должны вернуть само число
        assertEquals("1", Main.fizzBuzz(1));
    }
}