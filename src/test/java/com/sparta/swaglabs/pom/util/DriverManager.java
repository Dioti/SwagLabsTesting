package com.sparta.swaglabs.pom.util;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;

public class DriverManager {

    // TODO: implement driver/option/service factory

    public static void setDriverLocation(String browser, String path) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", path);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", path);
                break;
            default:
                System.err.println("Invalid browser, could not set driver");
        }
    }

    public static DriverService getDriverService(String browser, String path) {
        DriverService driverService = null;
        switch (browser) {
            case "chrome":
                driverService = getChromeDriverService(path);
                break;
            case "firefox":
                driverService = getGeckoDriverService(path);
                break;
            default:
                System.err.println("Invalid browser, could not set driver service");
        }
        return driverService;
    }

    public static ChromeDriverService getChromeDriverService(String path) {
        return new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(path))
                .usingAnyFreePort()
                .build();
    }

    public static GeckoDriverService getGeckoDriverService(String path) {
        return new GeckoDriverService.Builder()
                .usingDriverExecutable(new File(path))
                .usingAnyFreePort()
                .build();
    }
}
