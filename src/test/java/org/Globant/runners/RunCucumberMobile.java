package org.Globant.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.Globant.steps.mobile"}
)

public class RunCucumberMobile extends AbstractTestNGCucumberTests {

}
