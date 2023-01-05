package com.demo23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//*[@id='app']/header/a")
    private WebElement mainPageSymbol;

    @FindBy(xpath = "//img[@alt='Selenium Online Training']")
    public WebElement seleniumOnlineTraining;

    @FindBy(xpath = "//span[text() ='Tutorials']")
    public WebElement tutorials;

    public boolean VerifyDashboard() {
        return mainPageSymbol.isDisplayed();
    }
}
