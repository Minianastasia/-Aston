// Интерфейс фигура
interface Shape {
    double calculatePerimeter();

    double calculateArea();

    default void printDetails(String fillColor, String borderColor) {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}

// Класс круг
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Класс прямоугольник
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Класс треугольник
class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

public class Lesson11_2 {
    public static void main(String[] args) {
        // Создаем фигуры
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Выводим информацию о каждой фигуре
        System.out.println("Круг:");
        circle.printDetails("Синий", "Черный");

        System.out.println("\nПрямоугольник:");
        rectangle.printDetails("Зеленый", "Красный");

        System.out.println("\nТреугольник:");
        triangle.printDetails("Желтый", "Синий");
    }
}
