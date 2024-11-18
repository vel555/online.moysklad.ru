package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AuthPage extends BasePage {
    public static final By USERNAME = By.xpath("//input[@name='j_username']");
    public static final By PASSWORD = By.xpath("//input[@name='j_password']");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='error-msg']");

    public AuthPage(WebDriver driver) {
        super(driver);
    }
    @Step("Открыть страницу авторизации")

    public void open(){
        log.info("Открыть страницу"+URL);
        driver.get(URL+"/app");
    }

    @Step("Ввод логина и пароля в поля логин и пароль")

    public void inputLoginAndPassword(String name, String password){
        driver.findElement(USERNAME).sendKeys(name);
        log.info("Ввести имя пользователя " +name);
        driver.findElement(PASSWORD).sendKeys(password);
        log.info("Ввести пароль " +password);
    }

    @Step("Авторизация вводом логина и пароля с нажатием кнопки входа")

    public void login(String name, String password){
        open();
        inputLoginAndPassword(name, password);
        clicLoginButton();
    }

    @Step("Нажать кнопку регистрации")

    public void clicLoginButton(){
        driver.findElement(SUBMIT_BUTTON).click();
        log.info("Нажать кнопку регистрации");
    }

    @Step("Получение ошибки при вводе невалидных данных")

    public boolean getErrorMessage(){
       return driver.findElement(ERROR_MESSAGE).isDisplayed();
    }

    @Override

    public Boolean isPageOpened() {
        return isExist(SUBMIT_BUTTON);
    }
}
