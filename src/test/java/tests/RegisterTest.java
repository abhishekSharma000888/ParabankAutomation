package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

import java.util.UUID;

public class RegisterTest extends BaseTest {

    @Test
    public void testSuccessfulRegistration() {
        RegisterPage registerPage = new RegisterPage(driver);
        String randomUsername = "user" + UUID.randomUUID().toString().substring(0, 5);

        registerPage.registerUser(
                "John", "Doe", "123 Street", "New York", "NY", "10001",
                "1234567890", "123-45-6789", randomUsername, "password123"
        );

        String successMsg = registerPage.getSuccessMessage();
        Assert.assertTrue(successMsg.contains("Your account was created successfully"),
                "❌ Registration failed! Expected success message.");
    }

    @Test
    public void testRegistrationWithExistingUsername() {
        RegisterPage registerPage = new RegisterPage(driver);

        // Trying with an existing username "john" (default demo user)
        registerPage.registerUser(
                "Jane", "Smith", "456 Avenue", "Chicago", "IL", "60601",
                "9876543210", "987-65-4321", "john", "password123"
        );

        String errorMsg = registerPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("This username already exists"),
                "❌ Expected username already exists error message.");
    }
}
