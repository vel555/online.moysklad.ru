package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalHelpWindowTest extends BaseTest {

    WebDriver driver = new ChromeDriver();
    private By checkboxOfTheModalHelpWindow;
    private By closeButtonOfTheModalHelpWindow;


    @Test

    public void clickCheckbox(){
        WebElement checkbox = driver.findElement(checkboxOfTheModalHelpWindow);

        Assert.assertTrue(checkbox.isSelected(), "Чекбокс не нажат");
    }
    @Test

    public void closeModalCloseButton(){
        WebElement closeButton = driver.findElement(closeButtonOfTheModalHelpWindow);

        Assert.assertFalse(isModalPresent(),"Модальное окно не закрылось");

    }

    public boolean isModalPresent(){

       WebElement modal;
        modal = driver.findElement(By.xpath("//div[@class='lognex-popup-panel']"));

        Assert.assertFalse(isModalPresent(), "окно есть");


        return false;
    }

}
