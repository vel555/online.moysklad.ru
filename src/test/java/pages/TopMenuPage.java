package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuPage extends BasePage {

    private static final By MENU_USERNAME = By.xpath("//div[@class='menu-username-new']");

    private String menuBarOption = "//td[@class='gwt-MenuItem' and text()='%s']";

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectMenuBarOption(String option){
        driver.findElement(MENU_USERNAME).click();
        driver.findElement(By.xpath(String.format(menuBarOption,option))).click();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(MENU_USERNAME);
    }


}
