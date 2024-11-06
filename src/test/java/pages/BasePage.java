package pages;

import io.qameta.allure.Step;
import model.UserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;


public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public static String URL = "https://online.moysklad.ru/";

    private static final By POPUP_PANEL = By.className("lognex-popup-panel");

    private static final By POPUP_PANEL_CLOSE_BUTTON = By.xpath(
            "//button[@class='gwt-Button close-icon-dark GP34G-TKT']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Step("закрыть попуп панель")
    public void closePopupPanelIfNeedet(){
        WebElement popupPanel = driver.findElement(POPUP_PANEL);
        if (popupPanel.isDisplayed()){
            driver.findElement(POPUP_PANEL_CLOSE_BUTTON).click();
        }
    }


    protected boolean isExist(By element) {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (NoSuchElementException exception){
            return false;
        }

    }

    public abstract Boolean isPageOpened();

    public void inputUserInfo(UserSettings userSettings) {

    }
}


