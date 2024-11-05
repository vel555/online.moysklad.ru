package test;

import org.testng.Assert;
import  org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test(description = "закрыть всплывающее окно")

    public void dependsOn() {
        throw new NullPointerException();
    }


    public void closePopupWindow(){
        authPage.open();
        authPage.isPageOpened();
        authPage.login("admin@exhewa", "V7106340m");
        homePage.closePopupPanelIfNeedet();
        boolean homePageOpened= homePage.isPageOpened();

        Assert.assertTrue(homePageOpened);
    }
}
