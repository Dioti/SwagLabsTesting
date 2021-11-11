package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverFactory;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class HamburgerMenuSteps {
    private WebDriver webDriver;
    private ProductsPage productsPage;


    @When("I click on the burger menu")
    public void iClickOnTheBurgerMenu() {
        LoginPage loginPage = new LoginPage(webDriver);
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
