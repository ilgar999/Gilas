package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"html:target/cucumber-report.html",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        },
        glue = "com/step_definitions",
        features = "src/test/resources/Features",
        dryRun = true,
        tags = "@013"
)

public class CucesRunner {
}
