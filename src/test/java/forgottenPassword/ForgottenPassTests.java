package forgottenPassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPassTests extends BaseTest {

    @Test
    public void forgottenPassTests(){

        var forgottenPassPage = homePage.clickTheForgottenPassLink();
        forgottenPassPage.enterEmail("saletau@example.conj");

        var emailSentPage = forgottenPassPage.clickTheRetrieveButton();

        String textMessage = emailSentPage.getContentText();

        Assert.assertTrue(textMessage.contains("Your e-mail's been sent!"));
    }
}
