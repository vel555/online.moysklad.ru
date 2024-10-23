package test;

import org.testng.Assert;
import  org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test(description = "закрыть всплывающее окно")

    public void closePopupWindow(){

        homePage.open();
        homePage.closePopupPanelIfNeedet();
        homePage.isPageOpened();
        boolean homePageOpened= homePage.isPageOpened();

        Assert.assertTrue(homePageOpened);
    }
}
