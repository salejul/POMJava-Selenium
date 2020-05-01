package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeysPressPage {
    private WebDriver driver;
    private By keyPressInputField = By.xpath("//input[@id='target']");
    private By resultText = By.xpath("//p[@id='result']");

    public KeysPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(keyPressInputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }




}
