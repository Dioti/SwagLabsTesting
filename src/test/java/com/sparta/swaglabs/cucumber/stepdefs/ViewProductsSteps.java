package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.model.Product;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ViewProductsSteps {

    private StepDefManager manager;
    private ProductsPage productsPage;

    public ViewProductsSteps(StepDefManager manager) {
        this.manager = manager;
    }

    @Given("I am on the Products page")
    public void iAmOnTheProductsPage() {
        productsPage = new ProductsPage(manager.getWebDriver());
    }

    @Then("I see a list of products on the Products page")
    public void iSeeAListOfProductsOnTheProductsPage() {
        assertEquals(6, productsPage.getProducts().size());
    }
}
