package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadInputField = By.cssSelector("#file-upload");
    private By fileSubmitButton = By.cssSelector("#file-submit");
    private By uploadedFiles = By.cssSelector("#uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTheUploadButton(){
        driver.findElement(fileSubmitButton).click();
    }

    public void uploadFile(String absolutePathToFile){
        driver.findElement(fileUploadInputField).sendKeys(absolutePathToFile);
        clickTheUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }


}
