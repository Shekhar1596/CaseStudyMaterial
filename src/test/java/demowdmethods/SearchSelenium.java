package demowdmethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SearchSelenium {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void f() throws InterruptedException {

		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Main_Page/1");
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).click();
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium (software)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pt-createaccount\"]/a")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Create account - Wikipedia");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: "+url);
		Thread.sleep(3000);
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("wikipedia.org")) {
			System.out.println("Internal Link");
		}
		else {
			System.out.println("External Link");
		}
		Thread.sleep(3000);
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Selenium (software) - Wikipedia");
		String url1 = driver.getCurrentUrl();
		System.out.println("Page url is: "+url1);
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[2]/tbody/tr[10]/td/span/a")).click();
		Assert.assertEquals(driver.getTitle(), "SeleniumHQ Browser Automation");
		String url2 = driver.getCurrentUrl();
		System.out.println("Page url is: "+url2);
		String currentURL1 = driver.getCurrentUrl();
		if(currentURL1.contains("wikipedia.org")) {
			System.out.println("Internal Link");
		}
		else {
			System.out.println("External Link");
		}



	}


}
