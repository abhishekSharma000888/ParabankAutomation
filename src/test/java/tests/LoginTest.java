package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john", "demo"); // Parabank demo credentials

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Accounts Overview"),
                "❌ Login failed! Expected Accounts Overview page.");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrongUser", "wrongPass");

        String errorMsg = loginPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("The username and password could not be verified."),
                "❌ Incorrect error message on invalid login!");
    }
}