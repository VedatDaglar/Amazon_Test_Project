package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@id='a-autoid-0']")
    public WebElement cookieButton;

    @FindBy(linkText = "Amazon")
    public WebElement amazonLogo;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement logInTab;


    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "signInSubmit")
    public WebElement singInButton;

    public void login(){


        //cookieButton.click();
        logInTab.click();
        emailInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        continueButton.click();
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        singInButton.click();


    }



}
