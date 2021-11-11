package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends Page {
    private By twitterLink = new By.ByCssSelector(".social_twitter");
    private By facebookLink = new By.ByCssSelector(".social_facebook");
    private By linkedInLink = new By.ByCssSelector(".social_linkedin");
    private By cartLink = new By.ByCssSelector(".shopping_cart_link");

    private By hamburgerMenu = new By.ByCssSelector("#react-burger-menu-btn");
    private By allItemsLinkInHamburgerMenu = new By.ByCssSelector("#inventory_sidebar_link");

    private By hamburgerMenuWrap = new By.ByClassName("bm-menu-wrap");

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToTwitter() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(twitterLink).click();

    }

    public void goToFacebook() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(facebookLink).click();

    }

    public void goTolinkedIn() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(linkedInLink).click();
    }

    public void goToCart(){
        driver.findElement(cartLink).click();
    }

    public void goToHamburgerMenu() {
        driver.findElement(hamburgerMenu).click();
    }

    public void goToAllItemsFromHamburgerMenu() {
        if (isAttributePresent()) {
            driver.findElement(allItemsLinkInHamburgerMenu).click();
        }
    }

    private boolean isAttributePresent() {
        boolean result = false;
        try {
            String value = driver.findElement(hamburgerMenuWrap).getAttribute("aria-hidden");
            if (value != null){
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
