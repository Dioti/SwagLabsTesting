package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends Page {
    private By twitterLink = new By.ByCssSelector(".social_twitter");
    private By facebookLink = new By.ByCssSelector(".social_facebook");
    private By linkedInLink = new By.ByCssSelector(".social_linkedin");

    public ProductsPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void goToTwitter() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(twitterLink).click();
    }

    public void goToFacebook() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(facebookLink).click();
    }

    public void linkedIn() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(linkedInLink).click();
    }

}
