package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By rightClickField = By.xpath("//div[@id='hot-spot']");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTherightClickField(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(rightClickField)).perform();
    }

    public void alerts_acceptAlert(){
        driver.switchTo().alert().accept();
    }


    public String alerts_getText(){
        return driver.switchTo().alert().getText();
    }
}
