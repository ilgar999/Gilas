package com.step_definitions;

import com.pages.Google;
import com.utilities.BrowserUtil;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class google_step_definitions {

    Google google = new Google();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        String nameURL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(nameURL);

    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = "Google";
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.contains(actualTitle));

    }

    @When("User searches for apple")
    public void user_searches_for_apple() {

        google.searchBox.sendKeys("Apple" + Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualTitle = "Apple - Google Search";
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Actual title is not matching expected title",
                expectedTitle, actualTitle);

    }

    @When("User searches for {string}")
    public void user_searches_for(String string) {

        google.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

        String actualTitle = string;
        String expectedTile = Driver.getDriver().getTitle();
        Assert.assertEquals("Not matching", expectedTile, actualTitle);

    }

    @Then("User should see following links")
    public void user_should_see_following_links(List<String> expectedLinks) {

        System.out.println("Expected links = " + expectedLinks);
        for (WebElement eachLink : google.expectLinks){
            System.out.println("Each link: " + eachLink.getText());
        }

        BrowserUtil.sleep(2);
    }


}
