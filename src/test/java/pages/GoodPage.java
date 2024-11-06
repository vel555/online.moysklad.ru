package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodPage extends BasePage{
    private static final By GOODS_LABEL = By.xpath("//td/div[text()='Товары и услуги']");
    private static final By ADD_GOOD_BUTTON = By.xpath("//span[text()='Товар']");
    private static final Logger log = LoggerFactory.getLogger(GoodPage.class);


    public GoodPage(WebDriver driver) {
        super(driver);
    }
    @Step("Открыть страницу товаров")
    public void open(){
        driver.get(URL+"/#good");
        log.info("открылась страница товаров");
    }
    @Step("Нажать кнопку добавить товар")
    public void clikAddGootButton(){
        driver.findElement(ADD_GOOD_BUTTON).click();
        log.info("нажалась кнопка добавить товар");
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(GOODS_LABEL);
    }
}
