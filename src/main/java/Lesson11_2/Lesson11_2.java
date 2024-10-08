package Lesson11_2;
public class Lesson11_2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Голубой", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Оранжевый", "Темно-синий");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}