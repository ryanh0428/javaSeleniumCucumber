package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {


	
	public static WebElement contactheader(WebDriver driver) {
		return driver.findElement(By.tagName("h1"));
	}
	
	public static WebElement departmentSelection(WebDriver driver) {
		return driver.findElement(By.tagName("select"));
	}
	
	public static WebElement firstNameField(WebDriver driver) {
		return driver.findElement(By.id("firstname"));
	}
	
	public static WebElement lastNameField(WebDriver driver) {
		return driver.findElement(By.id("lastname"));
		
	}
	
	public static WebElement emailField(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement phoneNumberField(WebDriver driver) {
		return driver.findElement(By.id("contact"));
	}
	
	public static WebElement messageField(WebDriver driver) {
		return driver.findElement(By.id("message"));
	}
	
	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.id("contact_email"));
	}
	
	public static WebElement lastNameErrorField(WebDriver driver) {
		return driver.findElement(By.id("lastname-error"));
	}
	
	public static WebElement emailError(WebDriver driver) {
		return driver.findElement(By.id("email-error"));
	}
	
}
