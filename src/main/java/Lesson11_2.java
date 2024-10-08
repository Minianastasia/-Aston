class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }

    double calculateArea() {
        return width * height;
    }
}

class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculatePerimeter() {
        return a + b + c;
    }

    double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

public class Lesson11_2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Круг: Площадь = " + circle.calculateArea() + ", Периметр = " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Прямоугольник: Площадь = " + rectangle.calculateArea() + ", Периметр = " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник: Площадь = " + triangle.calculateArea() + ", Периметр = " + triangle.calculatePerimeter());
    }
}
