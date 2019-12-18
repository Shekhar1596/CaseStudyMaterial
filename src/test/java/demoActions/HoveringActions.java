package demoActions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoveringActions {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void f() {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

		WebElement aboutUs = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		WebElement ourOffices = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		WebElement chennai = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));

		Actions act = new Actions(driver);
		act.moveToElement(aboutUs).pause(2000).click().perform();
		act.moveToElement(ourOffices).pause(2000).click().perform();
		act.moveToElement(chennai).pause(2000).click().perform();
		Set<String> allWindows = driver.getWindowHandles();

		for(String singleWindows : allWindows) {
			driver.switchTo().window(singleWindows);
			System.out.println("Current window handle is :"+singleWindows);
		}

		WebElement frameadd = driver.findElement(By.name("main_page"));

		driver.switchTo().frame(frameadd);
		String address = driver.findElement(By.tagName("address")).getText();
		System.out.println("Address is : "+address);


	}
}
