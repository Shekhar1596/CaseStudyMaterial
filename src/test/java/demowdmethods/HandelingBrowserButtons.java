package demowdmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandelingBrowserButtons {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}



	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: "+url);

		driver.get("https://mvnrepository.com/");
		Assert.assertEquals(driver.getTitle(), "Maven Repository: Search/Browse/Explore");
		String url2 = driver.getCurrentUrl();
		System.out.println("Page url is: "+url2);

		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Google");
		String url3 = driver.getCurrentUrl();
		System.out.println("Page url is: "+url3);
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Assert.assertEquals(driver.getTitle(), "Maven Repository: Search/Browse/Explore");
		String url4 = driver.getCurrentUrl();
		System.out.println("Page url is: "+url4);
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		System.out.println("Page Refreshed");
		driver.close();


	}
}



