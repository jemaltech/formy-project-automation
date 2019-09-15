package PageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

import static PageObjects.RegistrationPage.locators.*;
import static org.testng.Assert.*;

public class RegistrationPageTest extends BaseTestClass{

    BaseActionsClass baseActionsClass;
    RegistrationPage registrationPage;

    @Test
    public void fillOutRegistrationForm() {
        baseActionsClass = new BaseActionsClass(getDriver());
        registrationPage = new RegistrationPage(getDriver());

        getDriver().get("https://formy-project.herokuapp.com/form");

        baseActionsClass.sendText(FIRST_NAME,"JEMAL");
        baseActionsClass.sendText(LAST_NAME,"MOHAMMED");
        baseActionsClass.sendText(JOB_TITLE,"QA ENGINEER");
        baseActionsClass.click(RADIO_BUTTON);
        baseActionsClass.click(CHECK_BOX);

        baseActionsClass.click(OPTIONS);

        baseActionsClass.sendText(DATE_PICKER,"09/14/2019");
        baseActionsClass.returnKeys(DATE_PICKER);

        baseActionsClass.click(SUBMIT_BUTTON);

        registrationPage.waitForElementToAppear(SUCCESS_ALERT);

        String ActualResult = baseActionsClass.getText(SUCCESS_ALERT);

        Assert.assertEquals("The form was successfully submitted!",ActualResult);


    }



}