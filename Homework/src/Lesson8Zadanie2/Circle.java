package Lesson8Zadanie2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Круг - Периметр: " + calculatePerimeter() + ", Площадь: " + calculateArea() + ", " + super.toString();
    }
}