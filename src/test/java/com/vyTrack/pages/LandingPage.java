package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(),toString());


    }
}
