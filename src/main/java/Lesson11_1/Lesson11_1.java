package Lesson11_1;
public class Lesson11_1 {
    public static void main(String[] args) {
        Dog naida = new Dog("Найда");
        Cat leks = new Cat("Лекс");

        naida.run(150);
        leks.swim(5);

        Bowl bowl = new Bowl(10);
        leks.eat(bowl);
        System.out.println("В миске осталось: " + bowl.foodAmount + " еды.");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}