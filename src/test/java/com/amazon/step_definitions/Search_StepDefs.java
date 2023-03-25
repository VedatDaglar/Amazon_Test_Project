package com.amazon.step_definitions;

import com.amazon.pages.BasePage;
import com.amazon.pages.HomePage;
import com.amazon.pages.ItemSearchPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_StepDefs {
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();

    ItemSearchPage itemSearchPage = new ItemSearchPage();



    @When("user navigates to amazon homepage")
    public void user_navigates_to_amazon_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //basePage.login();

        //basePage.cookieButton.click();


    }
    @When("user writes {string} into the search box and press enter")
    public void user_writes_itemName_into_the_search_box_and_press_enter(String itemName) {


        homePage.searchInputBox.sendKeys(itemName+ Keys.ENTER);



    }
    @Then("user should be able to see {string} on the results")
    public void user_should_be_able_to_see_item_on_the_results(String itemName) {

        String actualItemResultText = itemSearchPage.resultText.getText();

        System.out.println("actualItemResultText = " + actualItemResultText);

        Assert.assertTrue(actualItemResultText.contains(itemName));

    }

    @When("user clicks first item link on the list")
    public void user_clicks_first_item_link_on_the_list() {

        itemSearchPage.firstItem.click();

    }





}
