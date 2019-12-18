package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebShop {

	WebDriver driver;
	/*@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}*/


	@Given("DemoWebShop website is launched")
	public void demowebshop_website_is_launched() {
		driver.get("http://demowebshop.tricentis.com/");

	}

	@Given("User clicks on the Register button")
	public void user_clicks_on_the_Register_button() {
		driver.findElement(By.xpath("//a[@href='/register']")).click();

	}

	@When("User enters proper data for registration")
	public void user_enters_proper_data_for_registration() {

		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Shehkar");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("boomer@zoomer.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("IndiaJAPS");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("IndiaJAPS");


	}

	@Then("User clicks on submit button for account creation")
	public void user_clicks_on_submit_button_for_account_creation() {
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();

	}

	@Given("Registered user clicks on signIn link")
	public void registered_user_clicks_on_signIn_link() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();


	}

	@Then("User provides valid data for login input fields")
	public void user_provides_valid_data_for_login_input_fields() {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("boomer@zoomer.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("IndiaJAPS");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();


	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");

	}

	@Then("User clicks on search tab")
	public void user_clicks_on_search_tab() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();


	}

	@Then("User searches for the product")
	public void user_searches_for_the_product() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computing and Internet");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Given("The search product is available")
	public void the_search_product_is_available() {
		String endp = driver.findElement(By.xpath("//a[@href='/computing-and-internet'][contains(.,'Computing and Internet')]")).getText();
		Assert.assertEquals("Computing and Internet", endp);	

	}

	@Then("User adds in the cart")
	public void user_adds_in_the_cart() {
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

	}


}
