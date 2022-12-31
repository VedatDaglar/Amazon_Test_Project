package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.List;

public class ItemSearchPage {

    public ItemSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement resultText;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "//span[@id='submit.add-to-cart']//input")
    public WebElement addBasketButton;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public WebElement basketButton;

    @FindBy(xpath = "//span[@class='a-truncate-cut']")
    public WebElement basketItem;


}
