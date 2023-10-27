package hooks;

import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Myhooks {
	WebDriver driver;
	@Before
	public void setup() {
		Driverfactory.initilizebrowser();
	
		driver= Driverfactory.getdriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
	}
	@After
	public void teardown() {
		driver.quit();
		
	}

}

