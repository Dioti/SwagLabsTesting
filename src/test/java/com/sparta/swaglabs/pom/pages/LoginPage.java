package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        goToLoginPage();
    }

    private void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

}
