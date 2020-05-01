package windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTest {

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickTheDynamicLoadingLink().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(buttonPage.isStartButtonDisplayed(), "Not displayed!");
    }
}
