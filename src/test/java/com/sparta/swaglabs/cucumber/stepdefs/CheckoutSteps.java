package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.CheckoutCompletePage;
import com.sparta.swaglabs.pom.pages.CheckoutInformationPage;
import com.sparta.swaglabs.pom.pages.CheckoutOverviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutSteps {

    private StepDefManager manager;
    private CartPage cartPage;
    private CheckoutInformationPage checkoutInformationPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CheckoutCompletePage checkoutCompletePage;

    public CheckoutSteps(StepDefManager manager) {
        this.manager = manager;
    }

    @Given("I am viewing the shopping cart")
    public void iAmViewingTheShoppingCart() {
        cartPage = new CartPage(manager.getWebDriver());
    }

    @Given("I am on the Checkout Information page")
    public void iAmOnTheCheckoutInformationPage() {
        checkoutInformationPage = new CheckoutInformationPage(manager.getWebDriver());
    }

    @When("I fill in all shipping details")
    public void iFillInAllShippingDetails() {
        checkoutInformationPage.fillFirstName("John");
        checkoutInformationPage.fillLastName("Smith");
        checkoutInformationPage.fillPostCode("555 555");
    }

    @And("I click the Continue button")
    public void iClickTheContinueButton() {
        checkoutInformationPage.cont();
    }

    @When("I click the Checkout button")
    public void iClickTheCheckoutButton() {
        cartPage.checkout();
    }

    @Then("I go to the Checkout Information page")
    public void iGoToTheCheckoutInformationPage() {
        assertEquals("https://www.saucedemo.com/checkout-step-one.html", manager.getPageURL());
    }

    @Then("I go to the Checkout Overview page")
    public void iGoToTheCheckoutOverviewPage() {
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", manager.getPageURL());
    }

    @When("I fill in first name")
    public void iFillInFirstName() {
        checkoutInformationPage.fillFirstName("John");
    }

    @When("I fill in last name")
    public void iFillInLastName() {
        checkoutInformationPage.fillLastName("John");
    }

    @And("I fill in postcode")
    public void iFillInPostcode() {
        checkoutInformationPage.fillPostCode("555 555");
    }

    @Then("I see a \"First Name is required\" error message")
    public void iSeeAFirstNameIsRequiredErrorMessage() {
        String expectedError = "First Name is required";
        assertTrue(checkoutInformationPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Then("I see a \"Last Name is required\" error message")
    public void iSeeALastNameIsRequiredErrorMessage() {
        String expectedError = "Last Name is required";
        assertTrue(checkoutInformationPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Then("I see a \"Postal Code is required\" error message")
    public void iSeeAPostalCodeIsRequiredErrorMessage() {
        String expectedError = "Postal Code is required";
        assertTrue(checkoutInformationPage.getError().contains(expectedError)); // use assertTrue from junit4 only, not jupiter
    }

    @Given("I am on the Checkout Overview page")
    public void iAmOnTheCheckoutOverviewPage() {
        checkoutOverviewPage = new CheckoutOverviewPage(manager.getWebDriver());
    }

    @When("I press the Finish button")
    public void iPressTheFinishButton() {
        checkoutOverviewPage.finish();
    }

    @When("I press the Cancel button")
    public void iPressTheCancelButton() {
        checkoutOverviewPage.cancel();
    }

    @Then("I go to the Checkout Complete page")
    public void iGoToTheCheckoutCompletePage() {
        assertEquals("https://www.saucedemo.com/checkout-complete.html", manager.getPageURL());
    }
}
