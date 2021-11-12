package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends Page {
    
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        goToCheckoutOverviewPage();
    }

    private void goToCheckoutOverviewPage() {
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
    }

    public CheckoutInformationPage cancel() {
        driver.findElement(By.id("cancel")).click();
        return new CheckoutInformationPage(driver);
    }

    public CheckoutCompletePage finish() {
        driver.findElement(By.id("finish")).click();
        return new CheckoutCompletePage(driver);
    }
}
