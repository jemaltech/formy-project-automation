package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePageClass{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

//https://formy-project.herokuapp.com/form





    public interface locators{

        By FIRST_NAME = By.id("first-name");
        By LAST_NAME = By.id("last-name");
        By JOB_TITLE = By.id("job-title");
        By RADIO_BUTTON = By.id("radio-button-1");
        By CHECK_BOX = By.id("checkbox-1");
        By YEAR_EX = By.id("select-menu");
        By OPTIONS = By.cssSelector("option[value='1']");
        By DATE_PICKER = By.id("datepicker");
        By SUBMIT_BUTTON = By.cssSelector(".btn.btn-lg.btn-primary");
        By SUCCESS_ALERT = By.cssSelector(".alert.alert-success");




    }
}
