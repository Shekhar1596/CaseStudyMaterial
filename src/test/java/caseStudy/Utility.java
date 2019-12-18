package caseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class Utility {

	WebDriver driver;

	
	public static String getDriver(String browser) 
	{
		if(browser.equals("chrome"))
		{
			return System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
			
		}
		if(browser.equals("firefox"))
		{
			return System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
			
		}
		if(browser.equals("ie"))
		{
			return System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
			
		}
		else 
		{  
			return null;
		}
	}

}
