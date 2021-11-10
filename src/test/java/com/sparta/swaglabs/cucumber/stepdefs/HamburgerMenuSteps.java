package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HamburgerMenuSteps {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
    }

    @When("I click on the burger menu")
    public void iClickOnTheBurgerMenu() {
    }

    @And("I click the All Items link")
    public void iClickTheAllItemsLink() {
    }

    @Then("I am redirected to the Products page")
    public void iAmRedirectedToTheProductsPage() {
    }

    @And("I click the About link")
    public void iClickTheAboutLink() {
    }

    @Then("I am redirected to saucelabs.com")
    public void iAmRedirectedToSaucelabsCom() {
    }

    @And("I click on the log out link")
    public void iClickOnTheLogOutLink() {
    }

    @Then("I am logged out and redirected to the log in page")
    public void iAmLoggedOutAndRedirectedToTheLogInPage() {
    }

    @And("I click on Reset App State link")
    public void iClickOnResetAppStateLink() {
    }

    @Then("All items in the cart are removed")
    public void allItemsInTheCartAreRemoved() {
    }

    @After
    public void finished() {
        webDriver.quit();
    }

}
