package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends Page {

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        goToCheckoutCompletePage();
    }

    private void goToCheckoutCompletePage() {
        driver.get("https://www.saucedemo.com/checkout-complete.html");
    }

    public ProductsPage goToProductsPage() {
        driver.findElement(By.id("back-to-products")).click();
        return new ProductsPage(driver);
    }
}
