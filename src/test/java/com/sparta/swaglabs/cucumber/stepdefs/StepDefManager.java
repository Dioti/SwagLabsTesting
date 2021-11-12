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
    public void setUp() throws Exception {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
        webDriver = DriverFactory.getDriver("chrome");
        webDriver.get(getBaseURL());

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.fillWithUsername("standard_user");
        loginPage.fillWithPassword("secret_sauce");
        loginPage.submit();
    }

    @After
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }
}
