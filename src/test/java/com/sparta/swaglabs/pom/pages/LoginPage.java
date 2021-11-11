package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        super(driver);
        goToLoginPage();
    }

    private void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void fillWithUsername(String user) {
        driver.findElement(By.id("user-name")).sendKeys(user);
    }

    public void fillWithPassword(String pass) {
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    public void submitLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    public ProductsPage getRedirect() {
        return new ProductsPage(driver);
    }

}
