package com.sparta.swaglabs.pom;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.Page;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverFactory;
import com.sparta.swaglabs.pom.util.DriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ProductsPageTests {
    private WebDriver webDriver;
    private ProductsPage productsPage;

    @BeforeAll
    static void setUpBeforeAll() {
        DriverManager.setDriverLocation("chrome", "src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    void setUpBeforeEach() {
        webDriver = DriverFactory.getDriver("chrome");
        productsPage = new ProductsPage(webDriver);
    }

    @Test
    @DisplayName("Check if twitter link redirects you to twitter")
    void checkTwitterLinkRedirectsToTwitter() {
        LoginPage loginPage = new LoginPage(webDriver);

        try {
            Thread.sleep(10_000);
            productsPage.goToTwitter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> urls = new ArrayList<>();
        for (String s : productsPage.getURls()) {
            urls.add(productsPage.driver.switchTo().window(s).getCurrentUrl());
            System.out.println(s);
        }

        Assertions.assertEquals(true, urls.contains("https://twitter.com/saucelabs"));
    }
}
