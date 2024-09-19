package org.example;

public class Lesson5 {

    // 1. Метод printThreeWords()
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Метод checkSumSign()
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод printColor()
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод compareNumbers()
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Метод isSumInRange()
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Метод printPositiveOrNegative()
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Метод isNegative()
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Метод printStringMultipleTimes()
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Метод isLeapYear()
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Метод fillArray()
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2;
        }
    }

    // 11. Метод fillArrayWithNumbers()
    public static int[] fillArrayWithNumbers() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // 12. Метод modifyArray()
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 13. Метод fillDiagonal()
    public static int[][] fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    // 14. Метод initializeArray()
    public static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    // Метод main для вызова всех методов
    public static void main(String[] args) {
        // Вызов метода 1
        printThreeWords();

        // Вызов метода 2
        checkSumSign(5, -10);

        // Вызов метода 3
        printColor(101);

        // Вызов метода 4
        compareNumbers(5, 7);

        // Вызов метода 5
        System.out.println("Сумма в пределах от 10 до 20: " + isSumInRange(9, 5));

        // Вызов метода 6
        printPositiveOrNegative(-7);

        // Вызов метода 7
        System.out.println("Число отрицательное: " + isNegative(-3));

        // Вызов метода 8
        printStringMultipleTimes("Привет", 3);

        // Вызов метода 9
        System.out.println("Год високосный: " + isLeapYear(2024));

        // Вызов метода 10
        int[] binaryArray = new int[10];
        fillArray(binaryArray);
        System.out.println("Массив из 0 и 1: ");
        for (int i : binaryArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Вызов метода 11
        int[] numArray = fillArrayWithNumbers();
        System.out.println("Массив от 1 до 100: ");
        for (int i : numArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Вызов метода 12
        int[] modifyArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArray(modifyArr);
        System.out.println("Измененный массив: ");
        for (int i : modifyArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Вызов метода 13
        int[][] matrix = fillDiagonal(5);
        System.out.println("Квадратная матрица с заполненными диагоналями: ");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Вызов метода 14
        int[] initializedArray = initializeArray(5, 7);
        System.out.println("Инициализированный массив: ");
        for (int i : initializedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
