package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
    }

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
    }

    @When("I click the \"Add To Cart\" button next to an item")
    public void iClickTheButtonNextToAnItem() {
    }

    @Then("the item is added to cart")
    public void theItemIsAddedToCart() {
    }
}
