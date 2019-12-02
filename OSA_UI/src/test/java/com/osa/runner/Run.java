package com.osa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/java/com/osa/feature"
        ,glue={"com.osa.steps"},
    
        		plugin = {"pretty", "json:target/cucumber.json", "html:target/pretty-cucumber"}
        //,tags = {"@currentTest"}
        )
public class Run extends AbstractTestNGCucumberTests{

}
