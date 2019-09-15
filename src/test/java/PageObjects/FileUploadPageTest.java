package PageObjects;

import org.testng.annotations.Test;


public class FileUploadPageTest extends BaseTestClass {

    BaseActionsClass actionsClass ;
    FileUploadPage fileUploadPage ;


    //https://formy-project.herokuapp.com/fileupload

    @Test
    public void clickUploadButton() {
        actionsClass = new BaseActionsClass(getDriver());
        fileUploadPage = new FileUploadPage(getDriver());

        getDriver().get("https://formy-project.herokuapp.com/fileupload");

       // actionsClass.click(FileUploadPage.locators.UPLOAD_BUTTON);
        actionsClass.sendText(FileUploadPage.locators.UPLOAD_PLACEHOLDER_FILED,"Ehan.jpg");
        actionsClass.click(FileUploadPage.locators.UPLOAD_BUTTON);

    }

}