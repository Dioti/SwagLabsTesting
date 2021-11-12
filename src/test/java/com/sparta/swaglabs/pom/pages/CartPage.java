package com.sparta.swaglabs.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends Page{
    private By removeBagFromCartLink = new By.ByCssSelector("*[data-test=\"remove-sauce-labs-backpack\"]");
    private By cartBadge = new By.ByCssSelector(".shopping_cart_badge");

    public CartPage (WebDriver webDriver){
        super(webDriver);
    }
    public void removeBackpackFromCartWhenOnCartPage(){
        driver.findElement(removeBagFromCartLink).click();
    }

    public int numberOfItemsInCart(){
        List<WebElement> webElementList = driver.findElements(cartBadge);
        return webElementList.size();
    }
}
