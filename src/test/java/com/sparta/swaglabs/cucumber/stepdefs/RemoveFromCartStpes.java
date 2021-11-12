package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class RemoveFromCartStpes {
    private ProductsPage productsPage;
    private LoginPage loginPage;
    private StepDefManager manager;
    private CartPage cartPage;
    private By bagInfo = new By.ByClassName("inventory_item_desc");
    private int numOfItemsInCart;
    private int newNumOfItemsInCart;
    public RemoveFromCartStpes(StepDefManager manager) {
        this.manager = manager;
    }


    @Given("I am on the products page with items in the cart")
    public void iAmOnTheProductsPageWithItemsInTheCart() {
        loginPage = new LoginPage(manager.getWebDriver());
        loginPage.login("standard_user","secret_sauce");
        productsPage= loginPage.getRedirect();
        productsPage.addBagToCart();
    }
    @Given("I am on the cart inventory page with there are item in the cart")
    public void iAmOnTheCartInventoryPageWithThereAreItemInTheCart() {
        loginPage = new LoginPage(manager.getWebDriver());
        loginPage.login("standard_user","secret_sauce");
        productsPage= loginPage.getRedirect();
        productsPage.addBagToCart();
        cartPage= productsPage.goToCart();
    }

    @When("I click the remove button in the products page")
    public void iClickTheRemoveButtonInTheProductsPage() {
        numOfItemsInCart= productsPage.numberOfItemsInCart();
        productsPage.removeBackpackFromCartWhenOnProductsPage();
    }


    @When("I click the remove button in the cart inventory page")
    public void iClickTheRemoveButtonInTheCartInventoryPage() {
        numOfItemsInCart= cartPage.numberOfItemsInCart();
        cartPage.removeBackpackFromCartWhenOnCartPage();
    }

    @Then("Remove item from cart")
    public void removeItemFromCart() {
        numOfItemsInCart--;
        newNumOfItemsInCart= productsPage.numberOfItemsInCart();
        Assertions.assertEquals(numOfItemsInCart, newNumOfItemsInCart);
    }



}
