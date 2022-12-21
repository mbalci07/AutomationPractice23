package com.demo23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//*[@id='app']/header/a")
    private WebElement mainPageSymbol;



    public boolean VerifyDashboard(){
        return mainPageSymbol.isDisplayed();
    }
}
