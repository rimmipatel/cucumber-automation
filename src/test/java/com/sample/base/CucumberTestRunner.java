package com.sample.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:build/report.html",
                "json:build/report.json"
        },
        glue = {"com.sample"},
        features = "src/test/resources/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
