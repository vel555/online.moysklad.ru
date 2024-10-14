package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalHelpWindowPage extends BasePage{

    // чек бокс модального окна помощи
    private final By checkboxOfTheModalHelpWindow = By.xpath(
            "//input [@ id=\"gwt-uid-3\" ]");
    // кнопка закрытия модального окна помощи
    private final By closeButtonOfTheModalHelpWindow = By.xpath(
            "//button [@ class=\"gwt-Button close-icon-dark GP34G-TKT\" ]");

    public ModalHelpWindowPage(WebDriver driver) {
        super(driver);
    }

    public By getCheckboxOfTheModalHelpWindow() {
        return checkboxOfTheModalHelpWindow;
    }

    public By getCloseButtonOfTheModalHelpWindow() {
        return closeButtonOfTheModalHelpWindow;
    }
}
