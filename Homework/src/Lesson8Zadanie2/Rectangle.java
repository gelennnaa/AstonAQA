package Lesson8Zadanie2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник - Периметр: " + calculatePerimeter() + ", Площадь: " + calculateArea() + ", " + super.toString();
    }
}