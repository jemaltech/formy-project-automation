package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage extends BasePageClass{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }





    public interface locators{

        By DROP_DOWN_MENU = By.cssSelector(".btn.btn-primary.dropdown-toggle");
        By DROP_DOWN_ITEM = By.id("autocomplete");
    }
}
