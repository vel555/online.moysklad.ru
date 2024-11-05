package test;

import model.UserSettingBuilder;
import model.UserSettings;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners
public class AuthTest extends BaseTest{
    @DataProvider(name = "Авторизация с невалидными данными")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {"", "V7106340m"},
                {"admin@exhewa", ""},
                {"", ""},
                {6, 5},
                {"Имя", "Пароль"},
        };
    }
    @Parameters({"name", "password"})
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

        Assert.assertTrue(userSettingsPage.sussesNotificationIsVisible(),"неудачная авторизация" );

    }

    @Test(dataProvider = "Авторизация с невалидными данными")
    public void invalidAuthorization(String name, String pass) {
        authPage.open();
        authPage.isPageOpened();
        authPage.inputLoginAndPassword(name,pass);
        authPage.clicLoginButton();

        Assert.assertFalse(homePage.open(),"баг авторизации");
    }


}
