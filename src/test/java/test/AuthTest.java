package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthTest extends BaseTest{

    @Test
    public void userAuthorizationWithValidData(){
        authPage.open();
        authPage.isPageOpened();
        authPage.inputLoginAndPassword("admin@exhewa", "V7106340m");
        authPage.clicLoginButton();
        homePage.clocePopupPanelIfNeedet();

        topMenuPage.selectMenuBarOption("Настройки пользователя");

        userSettingsPage.inputUserInfo("sara","ret","givi","3456789","boss");
        userSettingsPage.clicSaveButton();
        userSettingsPage.sussesNotificationIsVisible();

        Assert.assertTrue(userSettingsPage.sussesNotificationIsVisible(),"неудачно" );

    }

}
