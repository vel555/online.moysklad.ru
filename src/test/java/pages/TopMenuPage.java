package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopMenuPage extends BasePage {

    private static final By MENU_USERNAME = By.xpath("//div[@class='menu-username-new']");
    private static final Logger log = LoggerFactory.getLogger(TopMenuPage.class);

    private String menuBarOption = "//td[@class='gwt-MenuItem' and text()='%s']";

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть меню бар и ввести название нужной строки")

    public void selectMenuBarOption(String option){
        driver.findElement(MENU_USERNAME).click();
        log.info("открылся меню бар");
        driver.findElement(By.xpath(String.format(menuBarOption,option))).click();
        log.info("ввелось название строки и кликнулось");
    }

    @Override

    public Boolean isPageOpened() {
        return isExist(MENU_USERNAME);
    }


}
