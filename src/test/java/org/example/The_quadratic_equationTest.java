package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class The_quadratic_equationTest {
    @Test
    public void testFindRoots() {
        // с двумя корнями
        assertEquals("x1 = 2.0, x2 = 1.0", The_quadratic_equation.findRoots(1, -3, 2));

        // с одним корнем
        assertEquals("x = 1.0", The_quadratic_equation.findRoots(1, -2, 1));

        // без вещественных корней
        assertEquals("there are no real roots", The_quadratic_equation.findRoots(1, 2, 5));
    }
}