package com.AutomatedTest.UI_Test.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/feature",
            glue = "com/AutomatedTest/UI_Test/Step_definition",
            dryRun =false,
            tags = "@Create_test",
            plugin = {"html:target/default-cucumber-reports",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
            }
    )
    public class CukesRunner {

    }



