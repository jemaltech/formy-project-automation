package PageObjects;

import org.testng.annotations.Test;

import static PageObjects.AutoCompletePage.locators.AUTOCOMPLETE_FIELD;
import static PageObjects.AutoCompletePage.locators.AUTOCOMPLETE_SELECT;
import static org.testng.Assert.*;

public class AutoCompletePageTest extends BaseTestClass{

    BaseActionsClass baseActionsClass;
    AutoCompletePage autoCompletePage;


    @Test
    public void fillUpAutoCompleteField(){
        baseActionsClass = new BaseActionsClass(getDriver());
        autoCompletePage = new AutoCompletePage(getDriver());
        getDriver().get("https://formy-project.herokuapp.com/autocomplete");

        baseActionsClass.sendText(AUTOCOMPLETE_FIELD,"1550 7th Street Northwest, Washington, DC, USA");
        //Thread.sleep(3000);

        autoCompletePage.waitForElementToAppear(AUTOCOMPLETE_SELECT);
        baseActionsClass.click(AUTOCOMPLETE_SELECT);




        //1550 7th Street Northwest, Washington, DC, USA

    }

}