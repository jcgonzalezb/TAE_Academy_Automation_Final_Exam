package org.Globant.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.Globant.steps.mobile"},
        tags = "@mobileTesting"
)

/**
 * Represents the runner used to make the mobile module tests.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class RunCucumberMobile extends AbstractTestNGCucumberTests {
}
