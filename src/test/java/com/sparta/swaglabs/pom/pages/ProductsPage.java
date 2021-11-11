package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends Page {
    //Footer Links
    private By twitterLink = new By.ByCssSelector(".social_twitter");
    private By facebookLink = new By.ByCssSelector(".social_facebook");
    private By linkedInLink = new By.ByCssSelector(".social_linkedin");

    //Hamburger Menu
    private By hamburgerMenu = new By.ByCssSelector("#react-burger-menu-btn");

    //Cart Link
    private By cartLink = new By.ByCssSelector(".shopping_cart_link");

    //Hamburger Menu Links
    private By allItemsLinkInHamburgerMenu = new By.ByCssSelector("#inventory_sidebar_link");
    private By aboutInHamburgerMenu = new By.ByCssSelector("#about_sidebar_link"); // - > https://saucelabs.com/
    private By resetAppStateInHamburgerMenu = new By.ByCssSelector("#reset_sidebar_link");
    private By logOutInHamburgerMenu = new By.ByCssSelector("#logout_sidebar_link");

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

    public void goToCart() {
        driver.findElement(cartLink).click();
    }

    public void goToHamburgerMenu() {
        driver.findElement(hamburgerMenu).click();
    }

    public void goToAllItemsFromHamburgerMenu() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(allItemsLinkInHamburgerMenu));
        element.click();
    }

    public void goToAboutFromHamburgerMenu() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(aboutInHamburgerMenu));
        element.click();
    }

    public void goToLogOutFromHamburgerMenu() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(logOutInHamburgerMenu));
        element.click();
    }

    public void goToResetAppStateFromHamburgerMenu() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(logOutInHamburgerMenu));
        element.click();
    }


}
