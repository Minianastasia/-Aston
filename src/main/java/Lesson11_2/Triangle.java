package Lesson11_2;
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String color, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        // Формула Герона для площади треугольника
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}