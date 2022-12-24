package com.demo23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//*[@id='app']/header/a")
    private WebElement mainPageSymbol;

    @FindBy(xpath = "//div[2]/div/div[2]/div/div[3]")
    private WebElement formsPageSymbol;



    public boolean VerifyDashboard(){
        return mainPageSymbol.isDisplayed();
    }
}
