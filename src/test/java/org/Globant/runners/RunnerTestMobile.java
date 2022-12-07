package org.Globant.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Disney.feature",
        glue = {"org.Globant.steps"}
)

public class RunnerTestMobile {

}
