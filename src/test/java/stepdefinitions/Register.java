package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	WebDriver driver;
	@Given("User navigate to register page")
	public void user_navigate_to_register_page() {
	    driver= Driverfactory.getdriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@When("User enter below feilds")
	public void user_enter_below_feilds(DataTable dataTable) {
		Map<String, String> datamap = dataTable.asMap(String.class,String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("firstname"));
		driver.findElement(By.id("input-lasttname")).sendKeys(datamap.get("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
		driver.findElement(By.id("input-password")).sendKeys(datamap.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("password"));
		
		
		
	    
	}

	@When("User select policy")
	public void user_select_policy() {
		driver.findElement(By.name("agree")).click();
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User account register successfully")
	public void user_account_register_successfully() {
	String expected=	driver.findElement(By.xpath(" //h1[text()='Your Account Has Been Created!']")).getText();
Assert.assertEquals(expected, "Your Account Has Been Created!");
	    
	}

	@When("User select yes of news letter")
	public void user_select_yes_of_news_letter() {
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
	    
	}

}
