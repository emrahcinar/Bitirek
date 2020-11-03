package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "prependedInput")
    public WebElement username;
    @FindBy(id = "prependedInput2")
    public WebElement password;
    @FindBy(id = "_submit")
    public WebElement login;
    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotYourPassword;
    @FindBy(css = "//div[.='Invalid user name or password.']")
    public WebElement invalid;

}
