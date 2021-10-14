package com.selenium.training;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\demos",
		glue = {"com.selenium.training.steps"},
		monochrome = true,
		plugin = {"pretty", "json:target/JSONReports/report.json",
				"pretty", "json:target/XMLReports/report.xml",
				"pretty", "html:target/HTMLReports/report.html"},
		tags = "@serviceTest or @regressionTest"
				
		)

public class TestRunner {


}
