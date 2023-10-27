package stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("User navigate to register page")
	public void user_navigate_to_register_page() {
		
		driver.findElement(By.xpath("//span[text()='My Account']"));
		
	   
	}

	@When("User enter below feilds")
	public void user_enter_below_feilds(DataTable dataTable) {
	    
	}

	@When("User select policy")
	public void user_select_policy() {
	    
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
	}

	@Then("User account register successfully")
	public void user_account_register_successfully() {
	    
	}

	@When("User select yes of news letter")
	public void user_select_yes_of_news_letter() {
	    
	}

}
