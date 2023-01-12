package com.demo23.stepDefinitions;

import com.demo23.pages.DashBoardPage;
import com.demo23.utilities.BrowserUtils;
import com.demo23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


    public class FormsPageStepDef {

        DashBoardPage dashBoardPage = new DashBoardPage();

        @Given("the user is on the forms page")
        public void the_user_is_on_the_forms_page() {




        }

        @Then("User verify the Forms page is opened")
        public void user_verify_the_Forms_page_is_opened() {
            BrowserUtils.waitFor(3);

            WebElement actualTitle = Driver.get().findElement(By.xpath("//*[@id='app']/div/div/div[1]"));
            Assert.assertEquals("Verify Title","Forms",actualTitle);
        }


    }


