package org.Globant.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/Espn.feature",
        glue = {"src/test/java/org/Globant/steps"}
)

public class TestRunnerWeb {

}
