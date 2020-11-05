package com.vyTrack.step_definitions;

import com.vyTrack.pages.LoginPage;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class Login_stepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        //WebDriverManager.chromedriver().setup();
        String url = ConfigurationReader.getProperty("urlVyTrack");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();
        //wait.until(ExpectedConditions.visibilityOf(loginPage.username));
        //String actual = Driver.getDriver().getTitle();
        //String expected = "Login";
        //Assert.assertEquals("Title is wrong", expected, actual);


    }

    @When("User enters credential")
    public void user_enters_credential() {
        String username=ConfigurationReader.getProperty("UsernameTruckDriver1");
        String password=ConfigurationReader.getProperty("passwordVyTrack");

        loginPage.login(username,password);





    }

    @Then("User name should be displayed")
    public void user_name_should_be_displayed() {


        String actual=Driver.getDriver().getTitle();
        String expected="Dashboardd";
        Assert.assertEquals("Title is not matching!!!",actual,expected);


    }


}
