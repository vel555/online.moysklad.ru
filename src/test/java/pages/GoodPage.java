package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoodPage extends BasePage{
    private static final By GOODS_LABEL = By.xpath("//td/div[text()='Товары и услуги']");
    private static final By ADD_GOOD_BUTTON = By.xpath("//span[text()='Товар']");


    public GoodPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL+"/#good");
    }

    public void clikAddGootButton(){
        driver.findElement(ADD_GOOD_BUTTON).click();
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(GOODS_LABEL);
    }
}
