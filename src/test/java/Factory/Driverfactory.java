package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driverfactory {
	static WebDriver driver;
	public static WebDriver initilizebrowser() {
		
		driver= new ChromeDriver();
		
			 return driver;
		
		
		
	
	}
	
}
