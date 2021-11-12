package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.model.Product;
import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ViewCartSteps {
    private WebDriver webDriver;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private StepDefManager manager;
    List<String> expectedItemDescription;
    public ViewCartSteps(StepDefManager manager) {
        this.manager = manager;
    }

    @Given("I'm on the products page")
    public void imOnTheProductsPage() {
        loginPage = new LoginPage(manager.getWebDriver());
        loginPage.login("standard_user","secret_sauce");
        productsPage= loginPage.getRedirect();
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {

        productsPage.goToCart();
    }

    @Then("I want to see the products in my shopping cart")
    public void iWantToSeeTheCorrectProductsInMyShoppingCart() {
        String actualUrl=manager.getPageURL();
        Assertions.assertEquals("https://www.saucedemo.com/cart.html",actualUrl);
    }

    @Given("I've added an item to the cart")
    public void iVeAddedAnItemToTheCart() {
        loginPage = new LoginPage(manager.getWebDriver());
        loginPage.login("standard_user","secret_sauce");
        productsPage= loginPage.getRedirect();
        productsPage.addBagToCart();
        productsPage.addTShirt();
        expectedItemDescription=productsPage.getBackpackAndTshirtInfo();
    }

    @When("I am on the cart page")
    public void iAmOnTheCartPage() {
        cartPage=productsPage.goToCart();
    }

    @Then("I want to see the details of the products in my shopping cart")
    public void iWantToSeeTheDetailsOfTheProductsInMyShoppingCart() {
        List<String> actualResults= cartPage.getDescOfItemsInCart();
        Assertions.assertTrue(actualResults.equals(expectedItemDescription));
    }

}