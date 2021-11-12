package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class CheckoutOverviewPage extends Page {
    
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        goToCheckoutOverviewPage();
    }

    private void goToCheckoutOverviewPage() {
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
    }

    public CheckoutInformationPage cancel() {
        driver.findElement(By.id("cancel")).click();
        return new CheckoutInformationPage(driver);
    }

    public CheckoutCompletePage finish() {
        driver.findElement(By.id("finish")).click();
        return new CheckoutCompletePage(driver);
    }

    public ArrayList<String> getSummaryInfo() {
        ArrayList<String> summary = new ArrayList<>();
        driver.findElements(By.className("summary_value_label"))
                .stream()
                .forEach(e -> summary.add(e.getText()));
        return summary;
    }

    public String getPaymentInformation() {
        return getSummaryInfo().get(0);
    }

    public String getDeliveryType() {
        return getSummaryInfo().get(1);
    }

    public int getItemCost() {
        return 0;
    }

    public int getTaxCost() {
        return 0;
    }

    public int getTotalCost() {
        return 0;
    }
}
