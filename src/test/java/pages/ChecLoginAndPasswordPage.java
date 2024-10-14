package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChecLoginAndPasswordPage extends BasePage {
    private final By loginButtonOnTheMainPage = By.xpath(
            "//li [@ class=\"menu-item menu-item-border\" ]/a [@href='/login/']");
    private final By enteringLoginInTheRegistrationField = By.xpath(
            "//input [@name='j_username']");
    private final By enteringPasswordInTheRegistrationField = By.xpath(
            "//input [@name='j_password']");
    private final By pressTheEnterButtonForAuthentication = By.xpath(
            "//button [@type='submit']");




    public ChecLoginAndPasswordPage(WebDriver driver) {
        super(driver);
    }

    public By getLoginButtonOnTheMainPage() {
        return loginButtonOnTheMainPage;
    }

    public By getEnteringLoginInTheRegistrationField() {
        return enteringLoginInTheRegistrationField;
    }

    public By getEnteringPasswordInTheRegistrationField() {
        return enteringPasswordInTheRegistrationField;
    }

    public By getPressTheEnterButtonForAuthentication() {
        return pressTheEnterButtonForAuthentication;
    }
}
