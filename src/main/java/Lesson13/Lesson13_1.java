package Lesson13;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson13_1 {
    public static void main(String[] args) {
        String[] countries = {"Россия", "США", "Канада", "Россия", "Китай", "Франция", "США", "Германия", "Китай", "Италия","Греция","Мордовия","Беларусь"};

        // Хранение уникальных стран
        Set<String> Uniquecountry = new HashSet<>();
        // Хранение количества  каждой страны
        Map<String, Integer> quantitycountry = new HashMap<>();

        for (String country :countries) {
            Uniquecountry.add(country);
            quantitycountry.put(country, quantitycountry.getOrDefault(country, 0) + 1);
        }

        // Вывод уникальных стран
        System.out.println("Уникальные страны: " + Uniquecountry);
        // Вывод количества
        System.out.println("Количество :");
        for (Map.Entry<String, Integer> запись : quantitycountry.entrySet()) {
            System.out.println(запись.getKey() + ": " + запись.getValue());
        }
    }
}
