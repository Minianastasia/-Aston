package Lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson13_2 {
    private Map<String, List<String>> phoneBook;

    public Lesson13_2() {
        this.phoneBook = new HashMap<>();
    }

    // Метод для добавления номера по фамилии
    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        Lesson13_2 phoneBook = new Lesson13_2();
        phoneBook.add("Жучков", "8917123456789");
        phoneBook.add("Мирный", "8917987654321");
        phoneBook.add("Петров", "8971111222333");
        phoneBook.add("Сидоров", "8917987652223");
        phoneBook.add("Кузнецов", "8971111222333");
        phoneBook.add("Сидоров", "8917987652223");
        phoneBook.add("Михайлов", "8971111222333");


        System.out.println("Номера Жучкова: " + phoneBook.get("Жучков"));
        System.out.println("Номера Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера Кузнецова: " + phoneBook.get("Кузнецов")); // фамилия отсутствует
    }
}
