package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.time.Duration;


public abstract class BaseTest {
    protected WebDriver driver;

    AuthPage authPage;
    HomePage homePage;
    GoodPage goodPage;
    GoodEditPage goodEditPage;
    TopMenuPage topMenuPage;
    UserSettingsPage userSettingsPage;





    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        authPage = new AuthPage(driver);
        homePage = new HomePage(driver);
        goodPage = new GoodPage(driver);
        goodEditPage = new GoodEditPage(driver);
        topMenuPage = new TopMenuPage(driver);
        userSettingsPage = UserSettingsPage(driver);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
