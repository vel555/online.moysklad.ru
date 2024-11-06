package test;

import model.AddGood;
import model.AddGoodBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodTest extends BaseTest{

    @Test(description = "вход на страницу товаров")
    public void productPageEntry(){
        goodPage.open();
        goodPage.isPageOpened();
        goodPage.clikAddGootButton();

        AddGood addGood = AddGoodBuilder.get();
        goodEditPage.writeIntoInput(addGood);
        goodEditPage.setSaveItemButton();

        Assert.assertTrue(goodEditPage.setProductCreated(),"продукт не сохранен");
    }
}
