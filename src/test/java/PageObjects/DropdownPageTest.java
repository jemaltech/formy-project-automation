package PageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

import static PageObjects.DropdownPage.locators.DROP_DOWN_ITEM;
import static PageObjects.DropdownPage.locators.DROP_DOWN_MENU;

public class DropdownPageTest extends BaseTestClass{

    DropdownPage dropdownPage;
    BaseActionsClass baseActionsClass;

    @Test
    public void testDropDownMenu() throws InterruptedException {
        dropdownPage = new DropdownPage(getDriver());
        baseActionsClass = new BaseActionsClass(getDriver());

        getDriver().get("https://formy-project.herokuapp.com/dropdown");


        baseActionsClass.click(DROP_DOWN_MENU);
        baseActionsClass.click(DROP_DOWN_ITEM);

        Assert.assertEquals("","");

        Thread.sleep(5000);

    }

}