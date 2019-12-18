package caseStudy;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ResourceCDN;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Scenarios {

	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/Reportforcasestudy.html");


		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("HostInfo", "GFT NextGen Testing Stream");
		extent.setSystemInfo("Environment", "Automation Testing Selenium");
		extent.setSystemInfo("Username", "Shekar Singh");


		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");

		htmlReporter.config().setDocumentTitle("Report for Case Study");
		htmlReporter.config().setReportName("Report for Case Study");
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
	}


	@Test(priority=1)
	public void testregistration() throws InterruptedException {


		test = extent.createTest("TC_01", "Application Registration validation");


		Utility obj=new Utility();
		obj.getDriver("chrome");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();

		String UsrInput;
		String condn;

		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		String exists = "Name Already Exists";
		System.out.println("I m outside loop");
		do {
			UsrInput =JOptionPane.showInputDialog("Enter Input");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(UsrInput);
			driver.findElement(By.xpath("//input[@id='firstName']")).click();
			Thread.sleep(2000);
			condn= driver.findElement(By.xpath("//span[@id='err']")).getText();
			Thread.sleep(2000);
			System.out.println(condn);
		}while(exists.equalsIgnoreCase(condn));	

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shehkar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("IndiaJAPS");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("IndiaJAPS");
		driver.findElement(By.xpath("//span[contains(.,'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("boomer@zoomer.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@placeholder='Date of Birth- mm/dd/yyyy']")).sendKeys("25/12/1965");


		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("xyzx");

		Select SQ = new Select(driver.findElement(By.name("securityQuestion")));
		SQ.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("symba");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String endp = driver.findElement(By.xpath("(//div[@id='errormsg'])[4]")).getText();
		Assert.assertEquals("User Registered Succesfully!!! Please login", endp);	


	}

	@Test(priority=2)
	public void testLogin() throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String endp2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		Assert.assertEquals("Hi, Lalitha SignOut", endp2);	


	}

	@Test(priority=3)
	public void testCart() throws InterruptedException {

		//driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		String name = driver.findElement(By.xpath("//h4[contains(@class,'nomargin')]")).getText();
		Assert.assertEquals("Headphone", name);												
	}

	@Test(priority=4)
	public void testpayment() throws InterruptedException {

		//driver.get("http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1");
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		//driver.findElement(By.xpath("//textarea[@name='ShippingAdd']")).sendKeys("xyzx");
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@onclick='radioValue()']")));
		driver.findElement(By.xpath("//a[@onclick='radioValue()']")).click();

		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//input[contains(@value,'PASSWORD')]")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "Order Details");
	}

	@AfterMethod
	public void endReportAfterTest() {
		extent.flush();
	}	
}

