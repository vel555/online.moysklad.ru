package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoodEditPage extends BasePage{

    public static final By ITEM_NAME_LABEL_INPUT = By.xpath(
            "//div[@class='gwt-Label vertical-field-label required']");


    public GoodEditPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL="/#good/edit?new&type=Good");
    }

    public void writeIntoInput(){
        new Input(driver,"Артикул").write("123");
        new Input(driver,"Внешний код").write("456");
        new Input(driver,"Код").write("789");
        new Input(driver,"Вес").write("10");
        new Input(driver,"Объем").write("5");
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(ITEM_NAME_LABEL_INPUT);
    }
}
