package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage extends BasePageClass{

    public DatePickerPage(WebDriver driver) {
        super(driver);

    }
    //https://formy-project.herokuapp.com/datepicker






    public interface locators{
        By DATEPICKER = By.cssSelector("#datepicker");

    }

}
