package com.sparta.swaglabs.cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
    }

    @When("I click the {string} button next to an item")
    public void iClickTheButtonNextToAnItem(String arg0) {
    }

    @Then("the item is added to cart")
    public void theItemIsAddedToCart() {
    }
}
