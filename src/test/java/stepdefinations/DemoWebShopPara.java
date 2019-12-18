package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebShopPara {
	
	WebDriver driver;
	
	@Given("User launched the browser")
	public void user_launched_the_browser() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    
	}

	@Given("Site is launched by userxx")
	public void site_is_launched_by_userxx() {
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Then("User provides all the required data for registrationxx")
	public void user_provides_all_the_required_data_for_registrationxx() {
	   
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shehkar");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("boomer@zoomer.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("IndiaJAPS");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("IndiaJAPS");

	}

	@Then("Proceeds for registrationxx")
	public void proceeds_for_registrationxx() {
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	    
	}

	@Given("Application is launchedxxxx")
	public void application_is_launchedxxxx() {
		
		System.out.println("App was launched");
	    
	}

	@When("User enters the registered valid Username xx {string}")
	public void user_enters_the_registered_valid_Username_xx(String uname) {
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(uname);
		
	    
	}

	@When("Valid Password in respective field xx {string}")
	public void valid_Password_in_respective_field_xx(String pswrd) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pswrd);
	   
	}

	@Then("Verifies the login statusxx")
	public void verifies_the_login_statusxx() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   
	}


}
