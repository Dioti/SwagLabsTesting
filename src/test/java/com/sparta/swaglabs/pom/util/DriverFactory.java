package com.sparta.swaglabs.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {
    public static WebDriver getDriver(String driver) {
        switch (driver) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            case "opera":
                return new OperaDriver();
            case "explorer":
                return new InternetExplorerDriver();
            default:
                return null;
        }
    }
}