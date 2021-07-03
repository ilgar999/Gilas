package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/step_definitions",
        features = "rerun:target/rerun.txt"
)

public class FailedCucesRunner {
}
