package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ChecLoginAndPasswordPage;

public class ChecLoginAndPasswordTest extends BaseTest {

    WebDriver driver = new ChromeDriver();
    loginButtonOnTheMainPage LoginButtonOnTheMainPage = new loginButtonOnTheMainPage(driver) ;
    enteringLoginInTheRegistrationField EnteringLoginInTheRegistrationField = new  enteringLoginInTheRegistrationField(driver);
    enteringPasswordInTheRegistrationField EnteringPasswordInTheRegistrationField = new enteringPasswordInTheRegistrationField(driver);
    PressTheEnterButtonForAuthentication pressTheEnterButtonForAuthentication = new PressTheEnterButtonForAuthentication(driver);




    @Test

    public void Login( String username, String password) {
       checLodinAndPasswordPage.driver.findElement(loginButtonOnTheMainPage).click();
       checLodinAndPasswordPage. driver.findElement(enteringLoginInTheRegistrationField).sendKeys("admin@exhewa");
       checLodinAndPasswordPage. driver.findElement(enteringPasswordInTheRegistrationField).sendKeys("V7106340m");
       checLodinAndPasswordPage. driver.findElement(pressTheEnterButtonForAuthentication).click();
    }
}

