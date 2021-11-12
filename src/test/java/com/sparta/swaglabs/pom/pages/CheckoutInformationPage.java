package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage extends Page {

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
        goToCheckoutInformationPage();
    }

    private void goToCheckoutInformationPage() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    public CheckoutOverviewPage cont() {
        driver.findElement(By.id("continue")).click();
        return new CheckoutOverviewPage(driver);
    }

    public CartPage cancel() {
        driver.findElement(By.id("cancel")).click();
        return new CartPage(driver);
    }

    public void fillFirstName(String firstName) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    public void fillPostCode(String postCode) {
        driver.findElement(By.id("postal-code")).sendKeys(postCode);
    }

    public CheckoutOverviewPage submitDetails(String firstName, String lastName, String postCode) {
        fillFirstName(firstName);
        fillLastName(lastName);
        fillPostCode(postCode);
        return cont();
    }

}
