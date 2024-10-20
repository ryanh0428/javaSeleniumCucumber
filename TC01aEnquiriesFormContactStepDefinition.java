
package stepDefinitionFiles;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Page Object Model Imports Go Here 

import pageObjectModel.ContactPage;

//Test Data Class Goes Here 

import testData.TestData;

public class TC01aEnquiriesFormContactStepDefinition

{

//Setups 

//Need this for the hover later 

	Actions actions;

	WebDriverWait wait;

//Instantiate the driver for this session 

	private WebDriver driver = null;

	public TC01aEnquiriesFormContactStepDefinition(BaseStepDefinition baseStepDefinition)

	{

		this.driver = baseStepDefinition.driver;

	}

//Pre-Conditions 

//Pre-Condition 1: Get the URL 
	


	@Given("the user is on the FDM contact page - http:\\/\\/www.fdmgroup.com\\/contact\\/")

	public void the_user_is_on_the_FDM_contact_page_http_www_fdmgroup_com_contact() throws Throwable {

		driver.get(TestData.contactUrl);

	}

//Pre-Condition 2: Maximise the window 

	@Given("^the contact window is maximised$")

	public void the_contact_window_is_maximised() throws Throwable {

		driver.manage().window().maximize();

	}

//Pre-Condition 3: Set Explicit Wait for up to 2 minutes 

	@Given("the contact wait is set for two minutes")

	public void the_contact_wait_is_set_for_two_minutes() throws Throwable {

		wait = new WebDriverWait(driver, 120);

		driver.manage().deleteAllCookies();

	}

//Main Body Tests 

	

//When The user is on the CONTACT page 
	@When("^The user is on the CONTACT page$")

	public void the_user_is_on_the_CONTACT_page() throws Throwable {

//Step 1: The user is on the CONTACT page 

		Assert.assertEquals(TestData.contactUrl, driver.getCurrentUrl());

	}

	@Then("^The heading is correct: Get in touch$")

	public void the_heading_is_correct_Get_in_touch() throws Throwable {

//Expected Result 1.2: The heading is correct: Get in touch 

		wait.until(ExpectedConditions.visibilityOf(ContactPage.contactheader(driver)));

		Assert.assertEquals(TestData.contactHeading, ContactPage.contactheader(driver).getText());

	}

	@When("The user enters first name {string} into the general enquiries first name field")

	public void the_user_enters_first_name_into_the_general_enquiries_first_name_field(String string) throws Throwable {

//Step 2: The user enters first name {string} into the general enquiries first name field 

		ContactPage.firstNameField(driver).sendKeys(TestData.contactFirstName);

	}

	@Then("First name {string} is displayed in the general enquiries first name field")

	public void first_name_is_displayed_in_the_general_enquiries_first_name_field(String string) throws Throwable {

//Expected Result 2.1: {string} is displayed in the general enquiries first name field 

		Assert.assertEquals(TestData.contactFirstName, ContactPage.firstNameField(driver).getAttribute("value"));

	}

	@When("The user enters last name {string} into the general enquiries last name field")

	public void the_user_enters_last_name_into_the_general_enquiries_last_name_field(String string) throws Throwable {

//Step 3: The user enters last name {string} into the general enquiries last name field 

		ContactPage.lastNameField(driver).sendKeys(TestData.contactLastName);

	}

	@Then("Last name {string} is displayed in the general enquiries last name field")

	public void last_name_is_displayed_in_the_general_enquiries_last_name_field(String string) throws Throwable {

//Expected Result 3.1: {string} is displayed in the general enquiries last name field 

		Assert.assertEquals(TestData.contactLastName, ContactPage.lastNameField(driver).getAttribute("value"));

	}

	@When("^The user presses the Submit button of the general enquiries form$")

	public void the_user_presses_the_Submit_button_of_the_general_enquiries_form() throws Throwable {

//Step 4: The user presses the Submit button of the general enquiries form 

		ContactPage.submitButton(driver).submit();

	}

	@Then("^The user should remain on the contact page with the heading Get in Touch$")

	public void the_user_should_remain_on_the_contact_page_with_the_heading_Get_in_Touch() throws Throwable {

//Expected Result 4.1 The user should remain on the contact page with the  heading Get in Touch 

		Assert.assertEquals(TestData.contactHeading, ContactPage.contactheader(driver).getText());

	}

	@Then("^An error occurs under general enquiries email field stating This field is required$")

	public void an_error_occurs_under_general_enquiries_email_field_stating_This_field_is_required() throws Throwable {

//Expected Result 4.2 An error occurs under general enquiries email field stating This field is required 

		Assert.assertEquals(TestData.contactEmailError, ContactPage.emailError(driver).getText());

	}

}