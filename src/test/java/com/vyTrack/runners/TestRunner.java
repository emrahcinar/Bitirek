package com.vyTrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber_report.html",
        features = "src/test/resources",
        glue = "com/vyTrack/step_definitions",
        tags = "@test"
)
public class TestRunner {


}
