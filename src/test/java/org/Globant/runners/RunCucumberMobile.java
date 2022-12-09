package org.Globant.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.Globant.steps.mobile"},
        tags = "@mobileTesting"
)

public class RunCucumberMobile extends AbstractTestNGCucumberTests {

}