package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HamburgerMenuSteps {
    private ProductsPage productsPage;
    private StepDefManager stepDefStateManager;

    public HamburgerMenuSteps(StepDefManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am logged in")
    public void theUserIsLoggedIn() {
        productsPage = new ProductsPage(stepDefStateManager.getWebDriver());
    }

    @When("I click on the burger menu")
    public void iClickOnTheBurgerMenu() {
        productsPage.goToHamburgerMenu();
    }

    @And("I click the All Items link")
    public void iClickTheAllItemsLink() {
        productsPage.goToAllItemsFromHamburgerMenu();
    }

    @Then("I am redirected to the Products page")
    public void iAmRedirectedToTheProductsPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", productsPage.getUrl());
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
}
