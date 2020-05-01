package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {

    @Test
    public void jsAlertTest(){
        var alertsPage = homePage.clickThejsAlertLink();
        alertsPage.triggerJSAlert();
        alertsPage.alerts_acceptAlert();
        String result = alertsPage.resultMessage();
        Assert.assertTrue(result.equals("You successfuly clicked an alert"), "Alert texts do not match!");

    }

    @Test
    public void jsConfirmTest(){
        var alertsPage = homePage.clickThejsAlertLink();
        alertsPage.triggerJSConfirm();
        String confirmText = alertsPage.alerts_getText();
        alertsPage.alerts_dismissAlert();
        Assert.assertEquals(confirmText, "I am a JS Confirm", "Texts do not match!");
        String confirmMessage = alertsPage.resultMessage();
        Assert.assertEquals(confirmMessage, "You clicked: Cancel", "Texts do not match!");
    }

    @Test
    public void jsPromptTests(){
        var alertsPage = homePage.clickThejsAlertLink();
        String message = "Mi smo Grobari najjaci smo najjaci!";
        alertsPage.triggerJSPrompt();
        alertsPage.alerts_setInput(message);
        alertsPage.alerts_acceptAlert();
        String resultsMessage = alertsPage.resultMessage();
        Assert.assertEquals(resultsMessage, "You entered: " + message, "Texts do not match!");

    }
}
