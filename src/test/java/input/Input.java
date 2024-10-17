package input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;

    private String inputLocator = "//span[text()='%s']/ancestor::tr[@class]//input";

    public Input(WebDriver driver,String label){
        this.driver=driver;
        this.label=label;
    }

    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).sendKeys(text);
    }

    public void clear(){
        driver.findElement(By.xpath(String.format(inputLocator,this.label))).clear();
    }
}
