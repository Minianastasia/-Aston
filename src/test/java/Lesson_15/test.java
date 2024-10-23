package Lesson_15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINI\\domashka\\Lesson_auto\\src\\main\\chromedriver.exe");

        // Создаем экземпляр ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Открываем страницу Google
        driver.get("https://www.google.com");

        // Закрываем браузер
        driver.quit();
    }
}
