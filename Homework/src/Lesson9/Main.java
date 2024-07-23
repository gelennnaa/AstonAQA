package Lesson9;

public class Main {

    public static void main(String[] args) {
        String[][] array1 = {
                {"20", "19", "18", "17"},
                {"16", "15", "14", "13"},
                {"12", "11", "10", "9"},
                {"8", "7", "6", "5"}
        };

        String[][] array2 = {
                {"20", "19", "18", "17"},
                {"16", "15", "aaa", "13"},
                {"12", "11", "10", "9"},
                {"8", "7", "6", "5"}
        };

        String[][] array3 = {
                {"20", "19", "18", "17"},
                {"16", "15", "14"},
                {"12", "11", "10", "9"},
                {"8", "7", "6", "5"}
        };

        try {
            int sum = sumArrayElements(array1);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = sumArrayElements(array2);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = sumArrayElements(array3);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива! Ожидается массив размером 4x4.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива! Ожидается массив размером 4x4.");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }
}
