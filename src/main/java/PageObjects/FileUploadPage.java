package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePageClass{


    public FileUploadPage(WebDriver driver) {
        super(driver);
    }





    public interface locators {

        By UPLOAD_BUTTON = By.cssSelector(".btn.btn-secondary.btn-choose");
        By UPLOAD_PLACEHOLDER_FILED = By.id("file-upload-field");

    }
}
