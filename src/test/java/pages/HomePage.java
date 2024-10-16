package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class HomePage extends BasePage{

    private static final By UPGRADE_BUTTON = By.xpath("//button[@data-test-id='home-page-upgrade-button']");
    private static final By POPUP_PANEL = By.className("lognex-popup-panel");
    private static final By POPUP_PANEL_CLOSE_BUTTON = By.xpath(
            "//div[@class='gwt-HTML GP34G-TOT GP34G-TEU']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL+"/#homepage");
        clocePopupPanelIfNeedet();
    }

    public void clocePopupPanelIfNeedet(){
        WebElement popupPanel = driver.findElement(POPUP_PANEL);
        if (popupPanel.isDisplayed()){
            driver.findElement(POPUP_PANEL_CLOSE_BUTTON).click();
        }
    }

    @Override
    protected Boolean isPageOpened(By element) {
        return isExist(UPGRADE_BUTTON);
    }
}
