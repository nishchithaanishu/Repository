package demo;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtentReport {
	@Test
	public void Screenshot() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
	}
	
	

}
