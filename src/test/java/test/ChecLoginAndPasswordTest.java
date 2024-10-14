package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChecLoginAndPasswordTest extends BaseTest {

    WebDriver driver = new ChromeDriver();
    loginButtonOnTheMainPage LoginButtonOnTheMainPage= new loginButtonOnTheMainPage;


    @Test

    public void Login(String login, String username, String password) {
        driver.findElement(LoginButtonOnTheMainPage).click();
        driver.findElement(By.id("enteringLoginInTheRegistrationField")).sendKeys("admin@exhewa");
        driver.findElement(By.id("enteringPasswordInTheRegistrationField")).sendKeys("V7106340m");
        driver.findElement(By.id("pressTheEnterButtonForAuthentication")).click();
    }
}

