package pages;

import elements.Input;
import io.qameta.allure.Step;
import model.AddGood;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodEditPage extends BasePage{

    public static final By ITEM_NAME_LABEL_INPUT = By.xpath(
            "//div[@class='gwt-Label vertical-field-label required']");
    private static final Logger log = LoggerFactory.getLogger(GoodEditPage.class);

    public static final By SAVE_ITEM_BUTTON = By.xpath("//span[text()='Сохранить']");

    public static final By PRODUCT_CREATED = By.xpath("//div[text()='Товар создан']");


    public GoodEditPage(WebDriver driver) {
        super(driver);
    }

    @Step("открыть страницу товара")
    public void open(){
        driver.get(URL="/#good/edit?new&type=Good");
        log.info("открылась страница товара");
    }

    @Step("заполнить страницу с товаром")
    public void writeIntoInput(AddGood addGood){
        new Input(driver,"Артикул").write(addGood.getItem());
        new Input(driver,"Внешний код").write(addGood.getExternalCode());
        new Input(driver,"Код").write(addGood.getCode());
        new Input(driver,"Вес").write(addGood.getWeight());
        new Input(driver,"Объем").write(addGood.getVolume());
        log.info("заполнились поля товара");
    }

    @Step("кнопка сохранить товар")
    public void setSaveItemButton(){
        driver.findElement(SAVE_ITEM_BUTTON).click();
        log.info("товар сохранен");
    }

    @Step("сообщение продукт создан")
    public boolean setProductCreated(){
        driver.findElement(PRODUCT_CREATED).isDisplayed();
        log.info("продукт создан");
        return true;
    }

    @Override
    public Boolean isPageOpened() {
        return isExist(ITEM_NAME_LABEL_INPUT);
    }
}
