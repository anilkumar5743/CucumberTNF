package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
WebDriver driver;
	

	@Before
	public void setup() {
		 driver = new ChromeDriver();	
		
}
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("User has navigate to login page")
	public void User_has_navigate_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']"));
		driver.findElement(By.linkText("Login")).click();
		
		
	}
	@When("User has entered valid emilid {string} into email field")
	public void user_has_entered_valid_emailid_into_email_field(String email)
		{
		driver.findElement(By.id("input-email")).sendKeys(email);
		    
		}

		@And("User has valid password {string} into password field")
		public void user_has_valid_password_into_password_field(String password) {
			driver.findElement(By.id("input-password")).sendKeys(password);
		}

		@And("user has to click on Login button")
		public void user_has_to_click_on_login_button() {
		    driver.findElement(By.xpath("//input[@value='Login']"));
		}

		@Then("user should get logged in")
		public void user_should_get_logged_in() {
		Boolean message=  driver.findElement(By.linkText("Edit your account information")).isDisplayed();
		  Assert.assertTrue(message);
		}

		@When("User has entered invalid emilid {string} into email field")
		public void user_has_entered_invalid_emilid_into_email_field(String invalidemail) {
			driver.findElement(By.id("input-email")).sendKeys(invalidemail);
}
		@When("User has invalid password {string} into password field")
		public void user_has_invalid_password_into_password_field(String password) {
			driver.findElement(By.id("input-password")).sendKeys(password);
		}

		
		@Then("user should get a proper warning message about data not match")
		public void user_should_get_a_proper_warning_message_about_data_not_match() {
		String warning=	driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		  Assert.assertEquals(warning, "Warning: No match for E-Mail Address and/or Password.");
		}


		
	

}
