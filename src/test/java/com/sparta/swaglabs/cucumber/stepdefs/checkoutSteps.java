package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.CheckoutInformationPage;
import com.sparta.swaglabs.pom.pages.CheckoutOverviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class checkoutSteps {

    private StepDefManager manager;
    private CartPage cartPage;
    private CheckoutInformationPage checkoutInformationPage;

    public checkoutSteps(StepDefManager manager) {
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

    @When("I click on the Checkout button")
    public void iClickOnTheCheckoutButton() {
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
}
