package Lesson_11_junit_5;

public class Factorial {
    public static long calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}