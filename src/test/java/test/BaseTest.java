package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.*;

import java.time.Duration;

@Listeners
public abstract class BaseTest {
    protected WebDriver driver;

    BasePage basePage;
    AuthPage authPage;
    HomePage homePage;
    GoodPage goodPage;
    GoodEditPage goodEditPage;
    TopMenuPage topMenuPage;
    UserSettingsPage userSettingsPage;


    @BeforeClass
    public void setUp(@Optional("chrome")String browser) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        authPage = new AuthPage(driver);
        homePage = new HomePage(driver);
        goodPage = new GoodPage(driver);
        goodEditPage = new GoodEditPage(driver);
        topMenuPage = new TopMenuPage(driver);
        userSettingsPage = new UserSettingsPage(driver);
        basePage = new BasePage(driver) {
            @Override
            public Boolean isPageOpened() {
                return true;
            }
        };

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
