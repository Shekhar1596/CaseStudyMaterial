package demowdmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyURL {
	
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void f() throws InterruptedException {
		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Main_Page/1");
		Assert.assertEquals(driver.getTitle(), "Wikipedia:Main Page/1 - Wikipedia");
		driver.findElement(By.linkText("History")).click();
		Assert.assertEquals(driver.getTitle(), "Portal:History - Wikipedia");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: "+url);
		System.out.println(driver.getPageSource());
		Thread.sleep(10000);
		driver.close();
  }
}
