package Lesson11_1;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl) {
        if (bowl.foodAmount >= 10) {
            isFull = true;
            bowl.foodAmount -= 10;
            System.out.println(name + " наелся.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}