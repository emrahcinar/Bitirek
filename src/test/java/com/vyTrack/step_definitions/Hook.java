package com.vyTrack.step_definitions;

import com.vyTrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Before
    public void setup(){

        Driver.getDriver().manage().window().maximize();


    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()){
            byte[]screenShot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
        }
        Driver.closeDriver();

    }




}
