package demoActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBag {


	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void f() throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement searchBX = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));

		Actions act = new Actions(driver);
		act.keyDown(searchBX, Keys.SHIFT).perform();

		act.sendKeys("b").pause(2000).sendKeys("a").pause(2000).sendKeys("g").perform();
		Thread.sleep(2000);

		//WebElement handBagEle =
		driver.findElement(By.xpath("(//div[contains(.,'Hand bag')])[4]")).click();
		//act.moveToElement(handBagEle).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String bagName = driver.findElement(By.xpath("//h4[contains(.,'Hand bag')]")).getText();
		Assert.assertTrue(bagName.contains("bag"));



	}
}
