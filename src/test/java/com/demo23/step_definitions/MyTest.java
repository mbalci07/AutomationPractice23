package com.demo23.step_definitions;

import com.demo23.utilities.BrowserUtils;
import com.demo23.utilities.ConfigurationReader;
import com.demo23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyTest {

    @Given("User is landed to demoqa.com page")
    public void user_is_landed_to_demoqa_com_page() {
        System.out.println("Opening the home page");
        //driver ==Driver.get()  //Driver.get()--> this gets the webdriver
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("The page title is {string}")
    public void the_page_title_is(String title) {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(title, actualTitle);
    }
}
