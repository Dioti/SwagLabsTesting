package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class FooterSteps {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
    }

    @When("I click on the Twitter icon")
    public void iClickOnTheTwitterIcon() {
    }

    @Then("I should be redirected to the company's Twitter profile")
    public void iShouldBeRedirectedToTheCompanySTwitterProfile() {
    }

    @When("I click on the Facebook icon")
    public void iClickOnTheFacebookIcon() {
    }

    @Then("I should be redirected to the company's Facebook profile")
    public void iShouldBeRedirectedToTheCompanySFacebookProfile() {
    }

    @When("I click on the Linkedin icon")
    public void iClickOnTheLinkedinIcon() {
    }

    @Then("I should be redirected to the company's Linkedin profile")
    public void iShouldBeRedirectedToTheCompanySLinkedinProfile() {
    }
}
