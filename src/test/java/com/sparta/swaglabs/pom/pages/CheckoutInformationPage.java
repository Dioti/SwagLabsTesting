package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class CheckoutInformationPage extends Page {

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
        goToCheckoutInformationPage();
    }

    private void goToCheckoutInformationPage() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void cont() {
        driver.findElement(By.id("continue")).click();
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

    public void submitDetails(String firstName, String lastName, String postCode) {
        fillFirstName(firstName);
        fillLastName(lastName);
        fillPostCode(postCode);
        cont();
    }

    public String getError() {
        List<WebElement> errorContainer = driver.findElements(By.className("error-message-container"));
        //errorContainer.stream().forEach(e -> System.out.println(e.getText()));
        if (errorContainer.size() != 0) { // if there's an error
            return driver.findElement(By.className("error-message-container")).getText(); // return error message
        } else {
            return null;
        }
    }
}
