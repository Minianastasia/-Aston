package Lesson16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TopUpPage {

    private WebDriver driver;

    // Локатор для заголовка блока

    @FindBy(xpath = "//div[contains(@class, 'pay__wrapper')]//h2[contains(text(), 'Онлайн пополнение')]")
    private WebElement blockTitle;


    // Локатор для логотипов платёжных систем
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")
    private WebElement paymentLogos;

    // Локатор для ссылки "Подробнее о сервисе"

    @FindBy(xpath =" //div[@id='pay-section']//a[text()='Подробнее о сервисе']")
    private WebElement serviceDetailsLink;


    // Локатор для поля ввода номера телефона
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement phoneNumberField;

    // Локатор для поля ввода суммы
    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement amountField;

    // Локатор для поля ввода E-mail
    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement emailField;

    // Локатор для кнопки "Продолжить"
    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement continueButton;

    // Локатор для выпадающего списка с услугами
   @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]/svg")
   private WebElement serviceDropdown;

    @FindBy(xpath = "//*[@id='cookie-agree']") // Локатор для принятия cookies
    private WebElement acceptCookiesButton;

    public void acceptCookies() {
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }
    // Конструктор класса TopUpPage
    public TopUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Инициализация элементов
    }

    public String getBlockTitleText() {
        return blockTitle.getText();
    }

    public boolean arePaymentLogosDisplayed() {
        return paymentLogos.isDisplayed();
    }
    // Проверка активности кнопки "Продолжить"
    public boolean isContinueButtonEnabled() {
        return continueButton.isEnabled();
    }


    // Проверка наличия подтверждения или результата после нажатия
    public boolean isConfirmationDisplayed() {
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@class='success-message']"));
        return confirmationMessage.isDisplayed();
    }



    public void clickServiceDetailsLink() {
        serviceDetailsLink.click();
    }
    public void clickContinueButton() {
        continueButton.click();
    }

    public boolean areFieldsPresent() {
        return phoneNumberField.isDisplayed() && amountField.isDisplayed() && emailField.isDisplayed();
    }

    // Метод для выбора типа услуги из выпадающего списка
    public void selectServiceType(String service) {
        serviceDropdown.click(); // Кликаем, чтобы открыть выпадающий список
        // Здесь добавьте код для выбора нужного типа услуги в зависимости от структуры страницы
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void enterAmount(String amount) {
        amountField.sendKeys(amount);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
}

