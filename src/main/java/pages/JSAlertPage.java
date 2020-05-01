package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By triggerConfirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By triggerPromptButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By results = By.xpath("//p[@id='result']");
    

    public JSAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerJSAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerJSConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerJSPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alerts_acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void alerts_dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String alerts_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alerts_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String resultMessage(){
        return driver.findElement(results).getText();
    }


}
