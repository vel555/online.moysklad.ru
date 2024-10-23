package pages;

import elements.Input;
import model.UserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSettingsPage extends BasePage {

    private static final By CHANGE_PASSWORD_BUTTON = By.xpath("//span[text()='Изменить пароль']");

    private static final By SAVE_BUTTON = By.xpath("//span[text()='сохранить']");

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

    public boolean sussesNotificationIsVisible(){
        return driver.findElement(SUCCESS_NOTIFICATION).isDisplayed();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(CHANGE_PASSWORD_BUTTON);
    }
}
