package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class FilterProductsSteps {

    @When("I click on the filter dropdown")
    public void iClickOnTheFilterDropdown() {
    }

    @And("I click on the Name \\(A-Z) dropdown option")
    public void iClickOnTheNameAZDropdownOption() {
    }

    @Then("The filter option should display Name\\(A-Z)")
    public void theFilterOptionShouldDisplayNameAZ() {
    }

    @And("The products should be displayed alphabetically, in ascending order")
    public void theProductsShouldBeDisplayedAlphabeticallyInAscendingOrder() {
    }

    @And("I click on the Name \\(Z-A) dropdown option")
    public void iClickOnTheNameZADropdownOption() {
    }

    @Then("The filter option should display Name\\(Z-A)")
    public void theFilterOptionShouldDisplayNameZA() {
    }

    @And("The products should be displayed alphabetically, in descending order")
    public void theProductsShouldBeDisplayedAlphabeticallyInDescendingOrder() {
    }

    @And("I click on Price \\(low to high) dropdown option")
    public void iClickOnPriceLowToHighDropdownOption() {
    }

    @Then("The filter option should display Price \\(low to high)")
    public void theFilterOptionShouldDisplayPriceLowToHigh() {
    }

    @And("The products should be displayed by price, in ascending order")
    public void theProductsShouldBeDisplayedByPriceInAscendingOrder() {
    }

    @And("I click on Price \\(high to low) dropdown option")
    public void iClickOnPriceHighToLowDropdownOption() {
    }

    @Then("The filter option should display Price \\(high to low)")
    public void theFilterOptionShouldDisplayPriceHighToLow() {
    }

    @And("The products should be displayed by price, in descending order")
    public void theProductsShouldBeDisplayedByPriceInDescendingOrder() {
    }
}
