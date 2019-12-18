package demowdmethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;

public class VerifyTestDemo {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void f() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page title is "+pageTitle);
		Assert.assertEquals(pageTitle, "Welcome: Mercury Tours");
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.partiallinkText("GISTE")).click();
		System.out.println("Register title : " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");


		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shekar");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("boomer@boomer.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("zyx");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("jeruselum");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("israel");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("737101");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Shekar Singh");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("India");
		driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("India");


		Select countryname = new Select(driver.findElement(By.name("country")));
		countryname.selectByIndex(200);

		driver.findElement(By.xpath("//input[@src='/images/forms/submit.gif']")).click();



	}


}


