package basic.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver(); // open chrome browser
		
		driver.get("https://www.google.com"); // open website
		
		driver.manage().window().maximize(); // maximizes the window
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
