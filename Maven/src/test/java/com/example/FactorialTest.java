package com.example;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    void testFactorialZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    void testFactorialPositiveNumber() {
        assertEquals(120, Factorial.calculate(5));
    }

    void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
        assertEquals("Число должно быть неотрицательным.", exception.getMessage());
    }
}