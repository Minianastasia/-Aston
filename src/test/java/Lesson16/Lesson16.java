package Lesson16;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson16 {

    private WebDriver driver;
    private TopUpPage topUpPage;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mts.by");
        topUpPage = new TopUpPage(driver);
        topUpPage = new TopUpPage(driver);
        topUpPage.acceptCookies();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBlockTitle() {
        assertEquals("Онлайн пополнение\nбез комиссии", topUpPage.getBlockTitleText(), "Заголовок блока неверен");
    }

    @Test
    public void testPaymentLogosDisplayed() {
        assertTrue(topUpPage.arePaymentLogosDisplayed(), "Логотипы платежных систем не отображаются");
    }

    @Test
    public void testServiceDetailsLink() {
        topUpPage.clickServiceDetailsLink();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl(), "Ссылка ведет на неверную страницу");
    }

    @Test
    public void testContinueButtonFunctionality() {
        // Заполняем все поля формы
        topUpPage.enterPhoneNumber("297777777");
        topUpPage.enterAmount("10");
        topUpPage.enterEmail("test@example.com");

        // Проверяем, что кнопка "Продолжить" активна
        assertTrue(topUpPage.isContinueButtonEnabled(), "Кнопка 'Продолжить' неактивна после заполнения полей формы");

        // Нажимаем на кнопку "Продолжить"
        topUpPage.clickContinueButton();

        // Проверяем, что после нажатия происходит ожидаемое действие (например, переход на другую страницу или отображение сообщения)
        assertTrue(topUpPage.isConfirmationDisplayed(), "Ожидаемое подтверждение не отображается после нажатия кнопки 'Продолжить'");

    }

    @Test
    public void testServiceOptions() {
        String[] services = {"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};

        for (String service : services) {
            topUpPage.selectServiceType(service);

            // Проверяем наличие полей после выбора услуги
            assertTrue(topUpPage.areFieldsPresent(), "Поля не отображаются для услуги: " + service);

            // Проверяем пустые поля для каждой услуги
            topUpPage.enterPhoneNumber("297777777");
            topUpPage.enterAmount("10");
            topUpPage.enterEmail("test@example.com");
        }
    }
}




