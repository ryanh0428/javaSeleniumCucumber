package testSuites;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions

(

		features = "C:\\Users\\ryanh\\eclipse-workspace\\FDMcucumberProject\\src\\test\\resources\\featureFiles"

		//,tags= "@UniversityDetailsSuccess" 

		, tags = "@EnquiriesFormContactFail"

		, glue = { "stepDefinitionFiles" }

		, plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html" }

		, monochrome = true

)

public class TestRunner

{

//Instantiate but no code required. 

}