package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class AppleTest {

	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/");
		Reporter.log("Apple executed",true);
	}
}
