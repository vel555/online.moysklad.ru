package pages;

import elements.Input;
import model.AddGood;
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

    public void writeIntoInput(AddGood addGood){
        new Input(driver,"Артикул").write(addGood.getItem());
        new Input(driver,"Внешний код").write(addGood.getExternalCode());
        new Input(driver,"Код").write(addGood.getCode());
        new Input(driver,"Вес").write(addGood.getWeight());
        new Input(driver,"Объем").write(addGood.getVolume());
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(ITEM_NAME_LABEL_INPUT);
    }
}
