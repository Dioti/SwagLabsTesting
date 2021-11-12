package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    private StepDefManager manager;
    private LoginPage loginPage;

    public LoginSteps(StepDefManager manager) {
        this.manager = manager;
    }

    @Given("The user account is locked")
    public void theUserAccountIsLocked() {
        loginPage.fillWithUsername("locked_out_user");
    }

    @Given("The user account is problematic")
    public void theUserAccountIsProblematic() {
        loginPage.fillWithUsername("problem_user");
    }

    @Given("The user account is glitched")
    public void theUserAccountIsGlitched() {
        loginPage.fillWithUsername("performance_glitch_user");
    }

    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        loginPage = new LoginPage(manager.getWebDriver());
    }

    @When("I type in a valid username in the username field")
    public void iTypeInAValidUsernameInTheUsernameField() {
        loginPage.fillWithUsername("standard_user");
    }

    @When("I type in an invalid username in the username field")
    public void iTypeInAnInvalidUsernameInTheUsernameField() {
        loginPage.fillWithUsername("invalid_user");
    }

    @When("I type in a valid password in the password field")
    public void iTypeInAValidPasswordInThePasswordField() {
        loginPage.fillWithPassword("secret_sauce");
    }

    @When("I type in an invalid password in the password field")
    public void iTypeInAnInvalidPasswordInThePasswordField() {
        loginPage.fillWithPassword("invalid_pass");
    }

    @When("I press the Login button")
    public void iPressTheLoginButton() {
        loginPage.submit();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        assertEquals("https://www.saucedemo.com/inventory.html", manager.getPageURL());
    }

    @Then("I should see an error message about invalid credentials")
    public void iShouldSeeAnErrorMessageAboutInvalidCredentials() {
        String expectedError = "Username and password do not match any user in this service";
        assertTrue(loginPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Then("I should see a \"username is required\" error message")
    public void iShouldSeeAUsernameIsRequiredErrorMessage() {
        String expectedError = "Username is required";
        assertTrue(loginPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Then("I should see a \"password is required\" error message")
    public void iShouldSeeAPasswordIsRequiredErrorMessage() {
        String expectedError = "Password is required";
        assertTrue(loginPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Then("I should see an error message about the account being locked")
    public void iShouldSeeAnErrorMessageAboutTheAccountBeingLocked() {
        String expectedError = "Sorry, this user has been locked out";
        assertTrue(loginPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }
}
