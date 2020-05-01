package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.xpath("//a[contains(text(),'Dropdown')]");
    private By forgottenPassLink = By.xpath("//a[contains(text(),'Forgot Password')]");
    private By hoversPageLink = By.linkText("Hovers");
    private By keyPressLink = By.xpath("//a[contains(text(),'Key Presses')]");
    private By horizontalSliderLink = By.xpath("//a[contains(text(),'Horizontal Slider')]");
    private By jsAlertLink = By.xpath("//a[contains(text(),'JavaScript Alerts')]");
    private By fileUploadLink = By.xpath("//a[contains(text(),'File Upload')]");
    private By contextMenuLink = By.xpath("//a[contains(text(),'Context Menu')]");
    private By dynamicLoadingLink = By.xpath("//a[contains(text(),'Dynamic Loading')]");
    private By largeAndDeepDOMLink = By.xpath("//a[contains(text(),'Large & Deep DOM')]");
    private By infiniteScrollLink = By.linkText("Infinite Scroll");
    private By multipleWindowsLink = By.xpath("//a[contains(text(),'Multiple Windows')]");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickTheAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickTheDropdownLink(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

    public ForgottenPasswordPage clickTheForgottenPassLink(){
        driver.findElement(forgottenPassLink).click();
        return new ForgottenPasswordPage(driver);
    }

    public HoversPage clickTheHoversLink(){
        driver.findElement(hoversPageLink).click();
        return new HoversPage(driver);
    }

    public KeysPressPage clickTheKeyPressLink(){
        driver.findElement(keyPressLink).click();
        return new KeysPressPage(driver);
    }

    public HorizontalSliderPage clickTheHorizontalSliderLink(){
        driver.findElement(horizontalSliderLink).click();
        return new HorizontalSliderPage(driver);
    }

    public JSAlertPage clickThejsAlertLink(){
        driver.findElement(jsAlertLink).click();
        return new JSAlertPage(driver);
    }

    public FileUploadPage clickTheFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickTheContextMenuLink(){
        driver.findElement(contextMenuLink).click();
        return new ContextMenuPage(driver);
    }

    public DynamicLoadingPage clickTheDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickTheLArgeAndDeepDOMLink(){
        driver.findElement(largeAndDeepDOMLink).click();
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickTheInfiniteScrollLink(){
        driver.findElement(infiniteScrollLink).click();
        return new  InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickTheMultipleWindowsLink(){
        driver.findElement(multipleWindowsLink).click();
        return new MultipleWindowsPage(driver);
    }
}
