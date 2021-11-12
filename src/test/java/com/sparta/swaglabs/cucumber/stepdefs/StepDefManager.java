package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverFactory;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class StepDefManager {
    private WebDriver webDriver;
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static ChromeDriverService service;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getPageURL(){
        return webDriver.getCurrentUrl();
    }

    public String getBaseURL() {
        return "https://www.saucedemo.com";
    }

    @Before
    public void setup() throws Exception {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
        webDriver = DriverFactory.getDriver("chrome");
        webDriver.get(getBaseURL());
        loginWithCredentials("standard_user", "secret_sauce"); // default
    }

    public void loginWithCredentials(String user, String pass) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login(user, pass);
    }

    @After
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }
}
