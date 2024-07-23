package Lesson8Zadanie2;

public abstract class Shape implements PerimeterCalculable, AreaCalculable {
    protected String fillColor;
    protected String borderColor;

    public Shape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String toString() {
        return "Цвет заливки: " + fillColor + ", Цвет границы: " + borderColor;
    }
}