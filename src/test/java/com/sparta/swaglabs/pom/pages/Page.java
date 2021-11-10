package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.WebDriver;

/**
 * Superclass of all pages. Every page should extend this one
 */
public class Page {

    WebDriver driver;

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

}
