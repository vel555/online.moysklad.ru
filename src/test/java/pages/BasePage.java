package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;


public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public static String URL = "https://www.moysklad.ru/app";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    protected boolean isExist(By element) {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (NoSuchElementException exception){
            return false;
        }

    }

    public abstract Boolean isPageOpened();
}


