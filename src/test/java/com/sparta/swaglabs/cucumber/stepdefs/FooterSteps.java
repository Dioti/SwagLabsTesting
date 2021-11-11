package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverFactory;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class FooterSteps {
    private WebDriver webDriver;
    private ProductsPage productsPage;

    @Before
    public void setUp() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
        webDriver = DriverFactory.getDriver("chrome");
        productsPage = new ProductsPage(webDriver);
    }

    @When("I click on the Twitter icon")
    public void iClickOnTheTwitterIcon() {
        LoginPage loginPage = new LoginPage(webDriver);
        try {
            Thread.sleep(10_000);
            productsPage.goToTwitter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    @After
    public void finish() {
        webDriver.quit();
    }
}
