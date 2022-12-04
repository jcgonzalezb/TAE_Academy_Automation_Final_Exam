package org.Globant.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.Globant.pageObjects.mobile.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"}
        )
public class TestRunnerMobile {

}
