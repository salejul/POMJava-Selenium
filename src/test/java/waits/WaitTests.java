package waits;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickTheDynamicLoadingLink().clickTheLink_Example1Link();
        loadingPage.clickStartButton();
        String expected = "Hello World!";
        String actual = loadingPage.getLoadedText();
        Assert.assertTrue(actual.equals(expected), "Error!");
    }

    @Test
    public void testWaitUntilTextShown(){
        var loadingPage = homePage.clickTheDynamicLoadingLink().clickTheLink_Example2Link();
        loadingPage.clickStartButton();
        String expected = "Hello World!";
        String actual = loadingPage.getLoadedText();
        Assert.assertTrue(actual.equals(expected), "Error!");
    }
}
