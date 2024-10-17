package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage extends BasePage {
    public static final By USERNAME = By.xpath("//input[@name='j_username']");
    public static final By PASSWORD = By.xpath("//input[@name='j_password']");
    public static final By SUBMIT_BUTTON = By.id("submitButton");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='error-msg']");

    public AuthPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get(URL);
    }


    public void inputLoginAndPassword(String name, String password){
        driver.findElement(USERNAME).sendKeys(name);
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clicLoginButton(){
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String getErrorMessage(){
       return driver.findElement(ERROR_MESSAGE).getText();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(SUBMIT_BUTTON);
    }
}
