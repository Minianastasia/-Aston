// Класс животное
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}

// Класс собака
class Dog extends Animal {
    private static int dogCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

// Класс кот
class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eatFromBowl(FoodBowl bowl) {
        int foodNeeded = 10;  // Порция еды для кота
        if (bowl.getFoodAmount() >= foodNeeded) {
            bowl.decreaseFood(foodNeeded);
            this.isFull = true;
            System.out.println(name + " поел. Теперь он сыт.");
        } else {
            System.out.println(name + " не хватает еды, он не будет есть.");
        }
    }
}

// Класс миска с едой
class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount - amount < 0) {
            foodAmount = 0;
        } else {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("Добавлено " + amount + " ед. еды. Всего в миске: " + foodAmount);
    }
}

public class Lesson11_1 {
    public static void main(String[] args) {
        // Создаем животных
        Dog dog = new Dog("Найда");
        Cat cat1 = new Cat("Мика");
        Cat cat2 = new Cat("Лекс");

        // Действия животных
        dog.run(150);
        cat1.run(200);
        dog.swim(5);
        cat2.swim(10);

        // Миска с едой
        FoodBowl bowl = new FoodBowl(20);

        // Коты пытаются поесть
        cat1.eatFromBowl(bowl);
        cat2.eatFromBowl(bowl);

        // Вывод количества созданных животных
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
    }
}
