package PageObjects;

import org.testng.annotations.Test;

import static PageObjects.DatePickerPage.locators.DATEPICKER;

public class DatePickerPageTest extends BaseTestClass{

    BaseActionsClass actionsClass;
    DatePickerPage datePickerPage;

    @Test
    public void sendDatePickers() {
        actionsClass = new BaseActionsClass(getDriver());
        datePickerPage = new DatePickerPage(getDriver());

        getDriver().get("https://formy-project.herokuapp.com/datepicker");

        actionsClass.sendText(DATEPICKER,"09/14/2019");
        actionsClass.returnKeys(DATEPICKER);


    }

}