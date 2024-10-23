package test;

import model.UserSettingBuilder;
import model.UserSettings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthTest extends BaseTest{

    @Test(description = "Авторизация пользователя с помощью достоверных данных")
    public void userAuthorizationWithValidData(){
        authPage.open();
        authPage.isPageOpened();
        authPage.inputLoginAndPassword("admin@exhewa", "V7106340m");
        authPage.clicLoginButton();
        homePage.closePopupPanelIfNeedet();

        topMenuPage.selectMenuBarOption("Настройки пользователя");

        UserSettings userSettings= UserSettingBuilder.get();
        userSettingsPage.inputUserInfo(userSettings);
        userSettingsPage.clicSaveButton();

        Assert.assertTrue(userSettingsPage.sussesNotificationIsVisible(),"неудачно" );

    }

}
