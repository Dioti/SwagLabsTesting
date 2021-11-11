package com.sparta.swaglabs.cucumber.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I type in a valid password in the password field")
    public void iTypeInAValidPasswordInThePasswordField() {
    }

    @And("I press the Login button")
    public void iPressTheLoginButton() {
    }

    @Then("I should see a \"username is required\" error message")
    public void iShouldSeeAUsernameIsRequiredErrorMessage() {
    }

    @Then("I should see a \"password is required\" error message")
    public void iShouldSeeAPasswordIsRequiredErrorMessage() {
    }

    @When("I type in a valid username in the username field")
    public void iTypeInAValidUsernameInTheUsernameField() {
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @And("I type in an invalid password in the password field")
    public void iTypeInAnInvalidPasswordInThePasswordField() {
    }

    @Then("I should see an error message about invalid credentials")
    public void iShouldSeeAnErrorMessageAboutInvalidCredentials() {
    }

    @When("I type in an invalid username in the username field")
    public void iTypeInAnInvalidUsernameInTheUsernameField() {
    }
}
