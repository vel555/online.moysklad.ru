package pages;

import elements.Input;
import model.UserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserSettingsPage extends BasePage {

    private static final By CHANGE_PASSWORD_BUTTON = By.xpath("//span[text()='Изменить пароль']");

    private static final By SAVE_BUTTON = By.xpath("//table[@class='b-editor-toolbar']//span[text()='Сохранить']");

    private static final By SUCCESS_NOTIFICATION = By.xpath("//tr[@class='dialogMiddle']//div[text()='Сотрудник сохранен']");


    public UserSettingsPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserInfo(UserSettings userSettings){

        new Input(driver,"Имя").write(userSettings.getName());
        new Input(driver,"Отчество").write(userSettings.getPatronymic());
        new Input(driver,"Фамилия").write(userSettings.getLastName());
        new Input(driver,"Телефон").write(userSettings.getPhone());
        new Input(driver,"Должность").write(userSettings.getPosition());
    }

    public void clicSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }

    public boolean sussesNotificationIsVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_NOTIFICATION));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    @Override
    public Boolean isPageOpened() {
        return isExist(CHANGE_PASSWORD_BUTTON);
    }
}
