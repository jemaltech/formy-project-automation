package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoCompletePage extends BasePageClass{

    public AutoCompletePage(WebDriver driver){
        super(driver);

    }



    public interface locators{

        By AUTOCOMPLETE_FIELD = By.cssSelector("#autocomplete");
        By AUTOCOMPLETE_SELECT = By.className("pac-item");


    }


}
