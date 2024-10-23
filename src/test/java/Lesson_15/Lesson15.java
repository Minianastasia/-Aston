package Lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson15 {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINI\\domashka\\Lesson_auto\\src\\main\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mts.by");
    }

    /*1 Название блока*/
    @Test
    public void checkTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        assertTrue(blockTitle.isDisplayed(), "Название блока не отображается");
    }
    /*2 Наличие логотипов*/
    @Test
    public void checkLogos() {
        WebElement logosList = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul"));
        assertTrue(logosList.isDisplayed(), "Логотипы платежных систем не отображаются");
    }
   /*3 Подробнее о сервисе*/
    @Test
    public void checkLink() {
        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
        assertTrue(moreInfoLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена");

        // Клик на ссылку
        moreInfoLink.click();

        // Ждем загрузки новой страницы и проверяем URL
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String actualUrl = driver.getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl), "Ссылка ведет на неправильную страницу");
    }
    /*4 Заполнить поля,проверить работу*/
    @Test
    public void checkPhoneAndButton() {
        WebElement phoneInput = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phoneInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' не активна");
        continueButton.click();
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}



