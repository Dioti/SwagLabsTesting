package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverFactory;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class FooterSteps {
    private ProductsPage productsPage;

    private StepDefManager stepDefStateManager;

    // PicoContainer injects class StepDefStateManager
    public FooterSteps (StepDefManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("The user is logged in")
    public void theUserIsLoggedIn() {
        LoginPage loginPage = new LoginPage(stepDefStateManager.getWebDriver());
        loginPage.login("standard_user", "secret_sauce");

        productsPage = new ProductsPage(stepDefStateManager.getWebDriver());
    }

    @When("I click on the Twitter icon")
    public void iClickOnTheTwitterIcon() {
//        LoginPage loginPage = new LoginPage(stepDefStateManager.getWebDriver());
        productsPage.goToTwitter();
    }

    @Then("I should be redirected to the company's Twitter profile")
    public void iShouldBeRedirectedToTheCompanySTwitterProfile() {
        List<String> urls = new ArrayList<>();
        for (String s : productsPage.getURls()) {
            urls.add(productsPage.driver.switchTo().window(s).getCurrentUrl());
        }
        Assertions.assertEquals(true, urls.contains("https://twitter.com/saucelabs"));
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
