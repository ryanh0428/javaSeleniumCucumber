package stepDefinitionFiles;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import driverUtilities.DriverUtilities;

import io.cucumber.java.After;

import io.cucumber.java.Before;

public class BaseStepDefinition {

	protected WebDriver driver = null;

	WebDriverWait wait;

// Uses the Pico Container 

	@Before

	public void setUp() throws Exception {

// Write code here that turns the phrase above into concrete actions 

		DriverUtilities myDriverUtilities = new DriverUtilities();

		driver = myDriverUtilities.getDriver();

		driver.manage().window().maximize();;

		wait = new WebDriverWait(driver, 120);

	}

	@After

	public void tearDown() {

		driver.close();

	}

}