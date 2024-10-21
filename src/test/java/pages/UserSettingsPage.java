package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSettingsPage extends BasePage {

    private static final By CHANGE_PASSWORD_BUTTON = By.xpath("//span[text()='Изменить пароль']");

    private static final By SAVE_BUTTON = By.xpath("//span[text()='сохранить']");

    private static final By SYCCESS_NOTIFICATION = By.xpath("//tr[@class='dialogMiddle']//div[text()='Сотрудник сохранен']");


    public UserSettingsPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserInfo(String name, String patronymic, String lastName, String phone,String position){

        new Input(driver,"Имя").write(name);
        new Input(driver,"Отчество").write(patronymic);
        new Input(driver,"Фамилия").write(lastName);
        new Input(driver,"Телефон").write(phone);
        new Input(driver,"Должность").write(position);
    }

    public void clicSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }

    public boolean sussesNotificationIsVisible(){
        return driver.findElement(SYCCESS_NOTIFICATION).isDisplayed();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(CHANGE_PASSWORD_BUTTON);
    }
}
