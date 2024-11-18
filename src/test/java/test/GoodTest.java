package test;

import model.AddGood;
import model.AddGoodBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodTest extends BaseTest{

    @Test(description = "Вход на страницу товаров с заполнением данных о товаре и его сохранении")

    public void productPageEntry(){
        authPage.login("admin@varay54249", "V7106340m");
        goodPage.open();
        goodPage.isPageOpened();
        goodPage.clikAddGootButton();

        AddGood addGood = AddGoodBuilder.get();
        goodEditPage.writeIntoInput(addGood);
        goodEditPage.setSaveItemButton();

        Assert.assertTrue(goodEditPage.setProductCreated(),"продукт не сохранен");
    }
}
