package com.demo23.stepDefinitions;

import com.demo23.pages.DashBoardPage;
import com.demo23.utilities.ConfigurationReader;
import com.demo23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPageStepDef {
    DashBoardPage dashBoardPage = new DashBoardPage();
    @Given("User opens the given link")
    public void userOpensTheGivenLink() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("User verify the Dashboard is opened")
    public void userVerifyTheDashboardIsOpened() {
        Assert.assertTrue(dashBoardPage.VerifyDashboard());
    }
}
