package test;

import org.testng.Assert;
import  org.testng.annotations.Test;
import pages.BasePage;

public class HomeTest extends BaseTest{

    @Test(description = "Авторизация в программе и закрыть всплывающее окно")

    public void dependsOn() {
        throw new NullPointerException();
    }


    public void closePopupWindow(){
        authPage.open();
        authPage.isPageOpened();
        authPage.login("admin@varay54249", "V7106340m");
        basePage.closePopupPanelIfNeedet();
        boolean homePageOpened= homePage.isPageOpened();

        Assert.assertTrue(homePageOpened);
    }
}
