package com.example;

mport org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    public void testFactorial() {
        assertEquals(1, Factorial.compute(0));
        assertEquals(1, Factorial.compute(1));
        assertEquals(2, Factorial.compute(2));
        assertEquals(6, Factorial.compute(3));
        assertEquals(24, Factorial.compute(4));
    }

    public void testNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.compute(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }
}