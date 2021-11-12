package com.sparta.swaglabs.pom.pages;

import com.sparta.swaglabs.pom.model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
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

    public List<String> getDescOfItemsInCart(){
        List<WebElement> elements = driver.findElements(By.className("cart_item"));
        List<String> desc=new ArrayList<String>();
        for (WebElement webElement :elements) {
            desc.add(webElement.findElement(By.className("inventory_item_desc")).getText());
        }
        return desc;
    }
}
