package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;

    String label;

    private String dropDownLocator = "//span[text()='%s']/ancestor::tr[@class]//input";

    private String optionLocator ="//div[text()='%s']";

    public DropDown(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }
}
