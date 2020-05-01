package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickTheAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        SecureAreaPage secureAreaPage = loginPage.clickTheLoginButton();

        assertTrue(secureAreaPage.getAlertText().contains("secure area"), "Something went wrong bro!");
    }
}
