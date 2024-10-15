package Lesson11_2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String color;
    private String borderColor;

    public Rectangle(double width, double height, String color, String borderColor) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
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