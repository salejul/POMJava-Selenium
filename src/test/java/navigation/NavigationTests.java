package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickTheDynamicLoadingLink().clickTheLink_Example1Link();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goToUrl("https://www.google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickTheMultipleWindowsLink().clickHere();
        getWindowManager().switchToTab("New Window");
        //getWindowManager().switchToTab("The Internet");
        System.out.println("Closing the Tab!");
        getWindowManager().closeWindow();
    }
}
