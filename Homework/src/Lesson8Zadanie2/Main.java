package Lesson8Zadanie2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7, "Красный", "Белый");
        Shape rectangle = new Rectangle(5, 9, "Синий", "Чёрный");
        Shape triangle = new Triangle(6, 7, 8, "Фиолетовый", "Коричневый");

        Shape[] shapes = { circle, rectangle, triangle };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}