package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.model.Product;
import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AddToCartSteps {
    private WebDriver webDriver;
    private String description;
    private ProductsPage productsPage;
    private LoginPage loginPage;
    private StepDefManager manager;
    private CartPage cartPage;
    private By bagInfo = new By.ByClassName("inventory_item_desc");
    private List<String> itemDescInCart;
    public AddToCartSteps(StepDefManager manager) {
        this.manager = manager;
    }
    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        loginPage = new LoginPage(manager.getWebDriver());
        loginPage.login("standard_user","secret_sauce");
        productsPage= loginPage.getRedirect();
    }

    @When("I click the \"Add To Cart\" button next to an item")
    public void iClickTheButtonNextToAnItem() {
        productsPage.addBagToCart();
        description= productsPage.getBackpackDescription();
    }

    @Then("the item is added to cart")
    public void theItemIsAddedToCart() {
        cartPage=productsPage.goToCart();
        itemDescInCart=cartPage.getDescOfItemsInCart();
        Assertions.assertTrue(itemDescInCart.contains(description));
    }
}
