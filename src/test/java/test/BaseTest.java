package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
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

    public class Retry implements IRetryAnalyzer {

        private int attempt = 1;
        private static final int MAX_RETRY = 3;

        @Override
        public boolean retry(@org.jetbrains.annotations.NotNull ITestResult iTestResult) {
            if (!iTestResult.isSuccess()) {
                if (attempt < MAX_RETRY) {
                    attempt++;
                    iTestResult.setStatus(ITestResult.FAILURE);
                    System.out.println("Retrying once again");
                    return true;
                } else {
                    iTestResult.setStatus(ITestResult.FAILURE);
                }
            } else {
                iTestResult.setStatus(ITestResult.SUCCESS);
            }
            return false;
        }

    }

    @BeforeClass
    public void setUp(@Optional("chrome")String browser) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        authPage = new AuthPage(driver);
        homePage = new HomePage(driver);
        goodPage = new GoodPage(driver);
        goodEditPage = new GoodEditPage(driver);
        topMenuPage = new TopMenuPage(driver);
        userSettingsPage = new UserSettingsPage(driver);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
