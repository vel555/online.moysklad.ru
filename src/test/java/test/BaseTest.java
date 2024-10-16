package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ChecLoginAndPasswordPage;

import java.time.Duration;


public abstract class BaseTest {
    protected WebDriver driver;
    ChecLoginAndPasswordPage checLodinAndPasswordPage = new ChecLoginAndPasswordPage(driver);
    ModalHelpWindowPage modalHelpWindowPage= new ModalHelpWindowPage(driver);


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
        driver.get("https://www.moysklad.ru/");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
