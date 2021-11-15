package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.model.Product;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ViewProductsSteps {

    private StepDefManager manager;
    private ProductsPage productsPage;
    private int randomProductID;

    public ViewProductsSteps(StepDefManager manager) {
        this.manager = manager;
    }

    @Given("I am on the Products page")
    public void iAmOnTheProductsPage() {
        productsPage = new ProductsPage(manager.getWebDriver());
    }

    @Given("There is at least one product on the Products page")
    public void thereIsAtLeastOneProductOnTheProductsPage() {
        // TODO: how do you handle conditional statements like this in cucumber?
        //productsPage.isEmpty();
    }

    @When("I click on the product image")
    public void iClickOnTheProductImage() {
        randomProductID = productsPage.clickRandomProductImage();
    }

    @When("I click on the product name")
    public void iClickOnTheProductName() {
        randomProductID = productsPage.clickRandomProductName();
    }

    @Then("I see a list of products on the Products page")
    public void iSeeAListOfProductsOnTheProductsPage() {
        assertEquals(6, productsPage.getProducts().size());
    }

    @Then("I go to the product page")
    public void iGoToTheProductPage() {
        String expected = manager.getBaseURL() + "/inventory-item.html?id=" + randomProductID;
        assertEquals(expected, manager.getPageURL());
    }

    @Then("I see a unique image for each product")
    public void iSeeAUniqueImageForEachProduct() {
        assertTrue(productsPage.imagesAreUnique());
    }
}
