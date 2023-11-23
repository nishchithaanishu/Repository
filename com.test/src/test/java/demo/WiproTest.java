package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class WiproTest {
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("Wipro executed",true);
		
	}
}
