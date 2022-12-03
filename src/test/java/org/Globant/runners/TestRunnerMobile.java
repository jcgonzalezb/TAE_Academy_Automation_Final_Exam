package org.Globant.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.Globant.pageObjects.mobile.SetUp;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"~@ignore"},
        plugin = "json:test/report/cucumber_report.json"
)
public class TestRunnerMobile {

    private TestNGCucumberRunner testNGCucumberRunner;

    /**
     * SetUp before to run suite of test.
     *
     * @author Arley.Bolivar
     */
    @BeforeTest


    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    /**
     * Close the application after completing the test.
     *
     * @author Arley.Bolivar
     */
    SetUp.mobileApplicationEnd();

}
