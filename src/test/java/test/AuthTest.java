package test;

import org.testng.annotations.Test;

public class AuthTest extends BaseTest{

    @Test
    public void userAuthorizationWithValidData(){
        authPage.open();
        authPage.inputLoginAndPassword("admin@exhewa", "V7106340m");
        authPage.clicLoginButton();
        homePage.clocePopupPanelIfNeedet();
        boolean homePageOpentd = homePage.isPageOpened();

        assert true(homePageOpentd);

    }

}
