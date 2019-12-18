package DemoExcel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DDTTestMeApp {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "credentials")
	public void f(String username, String password) throws InterruptedException{
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[@href='login.htm'][contains(.,'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();


	}
	@DataProvider(name="credentials")
	public Object[][] dp() throws IOException{
		return MyExcelReader.ReadData();
	}
}

