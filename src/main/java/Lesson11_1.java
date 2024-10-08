class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void run(int distance) {
        System.out.println(name + " пробежала " + distance + " м.");
    }

    void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыла " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть так далеко!");
        }
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

public class Lesson11_1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Найда");
        dog.run(500);
        dog.swim(5); // Пример плыть на 5 метров
        dog.swim(15); // Пример плыть на 15 метров

        Cat cat = new Cat("Лекс");
        cat.run(200);
        cat.swim(10); // Кот не умеет плавать
    }
}
