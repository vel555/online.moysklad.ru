package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    private static final By UPGRADE_BUTTON = By.xpath("//button[@data-test-id='home-page-upgrade-button']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean open(){
        driver.get(URL+"/app/#homepage");
        closePopupPanelIfNeedet();
        return true;
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(UPGRADE_BUTTON);
    }
}
