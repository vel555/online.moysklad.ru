package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage{

    private static final By UPGRADE_BUTTON = By.xpath("//button[@data-test-id='home-page-upgrade-button']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL+"/app/#homepage");
        clocePopupPanelIfNeedet();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(UPGRADE_BUTTON);
    }
}
