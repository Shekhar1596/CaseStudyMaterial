package demowdmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameDemo {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws InterruptedException {

		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'org.openqa.selenium.chrome')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("packageFrame");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='ChromeDriver.html']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'HasCapabilities')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());


	}
}
