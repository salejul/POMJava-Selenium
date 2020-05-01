package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage {

    private WebDriver driver;
    private By emailField = By.xpath("//input[@id='email']");
    private By retrieveButton = By.xpath("//button[@id='form_submit']");

    public ForgottenPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickTheRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }
}
