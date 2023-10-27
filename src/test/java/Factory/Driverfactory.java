package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driverfactory {
	static WebDriver driver=null;
	public static void initilizebrowser() {
		
		 driver= new ChromeDriver();
		}
	public static  WebDriver getdriver() {
		return driver;
		
	}
	
}
