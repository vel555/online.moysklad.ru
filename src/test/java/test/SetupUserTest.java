package test;

import model.UserSettingBuilder;
import model.UserSettings;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class SetupUserTest extends BaseTest {

    @Test(description = "Пользователь устанавливает свои настройки")

    public void userShouldBeSetUpHisSettings(){

        authPage.open();
        authPage.inputLoginAndPassword("admin@varay54249", "V7106340m");
        authPage.clicLoginButton();
        authPage.closePopupPanelIfNeedet();
        topMenuPage.selectMenuBarOption("Настройки пользователя");

        UserSettings userSettings= UserSettingBuilder.get();
        userSettingsPage.inputUserInfo(userSettings);
        boolean b = userSettingsPage.sussesNotificationIsVisible();

        Assert.assertTrue(b);
    }
}
