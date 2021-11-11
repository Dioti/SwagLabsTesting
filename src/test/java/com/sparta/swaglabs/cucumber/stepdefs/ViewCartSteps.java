package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.CartPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCartSteps {
    /*private WebDriver webDriver;
    private ProductsPage productsPage;
    private CartPage cartPage;
    @Before
    public void setUp() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
        webDriver=new ChromeDriver();
        productsPage=new ProductsPage(webDriver);
        cartPage=new CartPage(webDriver);
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        productsPage.goToCart();
    }

    @Then("I want to see the products in my shopping cart")
    public void iWantToSeeTheCorrectProductsInMyShoppingCart() {
        String actualUrl=webDriver.getCurrentUrl();
        Assertions.assertEquals("https://www.saucedemo.com/cart.html",actualUrl);
    }*/
}
