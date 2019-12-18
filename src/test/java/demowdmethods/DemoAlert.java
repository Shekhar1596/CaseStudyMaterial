package demowdmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAlert {

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

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

		Alert alertBX = driver.switchTo().alert();
		String alertMSG=alertBX.getText();
		System.out.println("Alert msg is: "+alertMSG);

		alertBX.sendKeys("Blyat");
		Thread.sleep(3300);
		alertBX.accept();
		//driver.close();




	}
}
