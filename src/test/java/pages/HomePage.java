package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomePage extends BasePage{

    private static final By UPGRADE_BUTTON = By.xpath("//button[@data-test-id='home-page-upgrade-button']");
    private static final Logger log = LoggerFactory.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть основную страницу с закрытием попуп панели")

    public boolean open(){
        driver.get(URL+"/app/#homepage");
        log.info("открылась основная страница");
        closePopupPanelIfNeedet();
        log.info("закрылась попуп панель");
        return true;
    }

    @Override

    public Boolean isPageOpened() {
        return isExist(UPGRADE_BUTTON);
    }
}
