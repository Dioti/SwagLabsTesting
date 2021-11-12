package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.model.Product;
import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.Collections.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilterProductsSteps {

    private StepDefManager manager;
    private ProductsPage productsPage;

    public FilterProductsSteps(StepDefManager manager) {
        this.manager = manager;
        productsPage = new ProductsPage(manager.getWebDriver());
    }

    @When("I click on the filter dropdown")
    public void iClickOnTheFilterDropdown() {
        productsPage.clickFilterDropdown();
    }

    @When("I click on the \"Name \\(A to Z)\" dropdown option")
    public void iClickOnTheNameAToZDropdownOption() {
        productsPage.selectNameAZ();
    }

    @When("I click on the \"Name \\(Z to A)\" dropdown option")
    public void iClickOnTheNameZToADropdownOption() {
        productsPage.selectNameZA();
    }

    @When("I click on \"Price \\(low to high)\" dropdown option")
    public void iClickOnPriceLowToHighDropdownOption() {
        productsPage.selectPriceLowToHigh();
    }

    @When("I click on \"Price \\(high to low)\" dropdown option")
    public void iClickOnPriceHighToLowDropdownOption() {
        productsPage.selectPriceHighToLow();
    }

    @Then("The filter option should display \"NAME \\(A TO Z)\"")
    public void theFilterOptionShouldDisplayNAMEATOZ() {
        assertEquals("NAME (A TO Z)", productsPage.getCurrentFilter());
    }

    @Then("The filter option should display \"NAME \\(Z TO A)\"")
    public void theFilterOptionShouldDisplayNAMEZTOA() {
        assertEquals("NAME (Z TO A)", productsPage.getCurrentFilter());
    }

    @Then("The filter option should display \"PRICE \\(LOW TO HIGH)\"")
    public void theFilterOptionShouldDisplayPRICELOWTOHIGH() {
        assertEquals("PRICE (LOW TO HIGH)", productsPage.getCurrentFilter());
    }

    @Then("The filter option should display \"PRICE \\(HIGH TO LOW)\"")
    public void theFilterOptionShouldDisplayPRICEHIGHTOLOW() {
        assertEquals("PRICE (HIGH TO LOW)", productsPage.getCurrentFilter());
    }

    @Then("The products should be displayed alphabetically, in ascending order")
    public void theProductsShouldBeDisplayedAlphabeticallyInAscendingOrder() {
        ArrayList<String> productNames = new ArrayList<>();
        productsPage.getProducts().stream().forEach(p -> productNames.add(p.getName()));
        ArrayList<String> expected = productNames; // copy names array
        sort(expected); // sort it in ascending order
        assertEquals(expected, productNames);
    }

    @Then("The products should be displayed alphabetically, in descending order")
    public void theProductsShouldBeDisplayedAlphabeticallyInDescendingOrder() {
        ArrayList<String> productNames = new ArrayList<>();
        productsPage.getProducts().stream().forEach(p -> productNames.add(p.getName()));
        ArrayList<String> expected = productNames; // copy names array
        sort(expected, reverseOrder()); // sort it in descending order
        assertEquals(expected, productNames);
    }

    @Then("The products should be displayed by price, in ascending order")
    public void theProductsShouldBeDisplayedByPriceInAscendingOrder() {
        ArrayList<Integer> productPrices = new ArrayList<>();
        productsPage.getProducts().stream().forEach(p -> productPrices.add(p.getPrice()));
        ArrayList<Integer> expected = productPrices; // copy prices array
        sort(expected); // sort it in ascending order
        assertEquals(expected, productPrices);
    }

    @Then("The products should be displayed by price, in descending order")
    public void theProductsShouldBeDisplayedByPriceInDescendingOrder() {
        ArrayList<Integer> productPrices = new ArrayList<>();
        productsPage.getProducts().stream().forEach(p -> productPrices.add(p.getPrice()));
        ArrayList<Integer> expected = productPrices; // copy prices array
        sort(expected, reverseOrder()); // sort it in descending order
        assertEquals(expected, productPrices);
    }
}
