package org.example;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {

    public void testFactorialZero() {
        assertEquals(Factorial.calculate(0), 1);
    }

    public void testFactorialPositiveNumber() {
        assertEquals(Factorial.calculate(5), 120);
    }

    public void testFactorialNegativeNumber() {
        try {
            Factorial.calculate(-1);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Число должно быть неотрицательным.");
        }
    }
}