package test;

import  org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test

    public void closePorupWindow(){

        homePage.open();
        homePage.clocePopupPanelIfNeedet();
        homePage.isPageOpened();
        boolean homePageOpened= homePage.isPageOpened();

        assert true(homePageOpened);
    }
}
