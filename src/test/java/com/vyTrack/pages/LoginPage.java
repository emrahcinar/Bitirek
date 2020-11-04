package com.vyTrack.pages;

import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "prependedInput")
    private WebElement username;
    @FindBy(id = "prependedInput2")
    private WebElement password;
    @FindBy(id = "_submit")
    private WebElement login;
    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotYourPassword;
    @FindBy(css = "//div[.='Invalid user name or password.']")
    private WebElement invalid;


    public void login(String user, String pass) {



        username.sendKeys(user);
        password.sendKeys(pass);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        wait.until(ExpectedConditions.titleIs("Dashboard"));



    }

}
