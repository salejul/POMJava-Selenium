package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By inputSlider = By.xpath("//div[@class='sliderContainer']//input");
    private By rangeValue = By.cssSelector("#range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSliderValue(){
        return driver.findElement(rangeValue).getText();
    }

    public void setSliderValue(String value){
        while (!getSliderValue().equals(value))
            driver.findElement(inputSlider).sendKeys(Keys.ARROW_RIGHT);
    }


}
