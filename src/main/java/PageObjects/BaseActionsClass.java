package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BaseActionsClass extends BasePageClass{

    public BaseActionsClass(WebDriver driver) {
        super(driver);
    }

    //Click Method
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }
    public void sendText(By elementField,String text){
        driver.findElement(elementField).sendKeys(text);
    }

    public void returnKeys(By elementLocation){
        driver.findElement(elementLocation).sendKeys(Keys.RETURN);

    }

    public String getText(By elementLocation){
        return driver.findElement(elementLocation).getText();
    }

}
