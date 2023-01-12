package com.demo23.stepDefinitions;

import com.demo23.pages.BasePage;
import com.demo23.pages.DashBoardPage;
import com.demo23.utilities.BrowserUtils;
import com.demo23.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class FormsPageStepDef extends BasePage {

        DashBoardPage dashBoardPage = new DashBoardPage();

        @Given("the user is on the forms page")
        public void the_user_is_on_the_forms_page() {


          JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
          executor.executeScript("arguments[0].scrollIntoView();", dashBoardPage.formsPageSymbol);
          dashBoardPage.formsPageSymbol.click();


        }

        @Then("User verify the Forms page is opened")
        public void user_verify_the_Forms_page_is_opened() {
            BrowserUtils.waitFor(3);
            Assert.assertEquals("Verify Title","Forms",dashBoardPage.getFormsTitle());
        }
    }


