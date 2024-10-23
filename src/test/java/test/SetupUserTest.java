package test;

import model.UserSettingBuilder;
import model.UserSettings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetupUserTest extends BaseTest {

    @Test(description = "Пользователь должен установить свои настройки")

    public void userShouldBeSetUpHisSettings(){

        authPage.inputLoginAndPassword("admin@exhewa", "V7106340m")
                .closePopupPanelIfNeedet();
        topMenuPage.selectMenuBarOption("Настройки пользователя");

        UserSettings userSettings= UserSettingBuilder.get();
        boolean b =userSettingsPage.inputUserInfo(userSettings)
                .sussesNotificationIsVisible();

        Assert.assertTrue(b);
    }
}
