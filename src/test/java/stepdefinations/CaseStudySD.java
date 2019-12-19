package stepdefinations;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudySD {

	WebDriver driver;

	@Given("Browser launched")
	public void browser_launched() {

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("Launch the website")
	public void launch_the_website() {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();


	}

	@Given("User launched the website")
	public void user_launched_the_website() {
		System.out.println("Site was launched");
	}

	@Then("User clicks on the SignUp button")
	public void user_clicks_on_the_SignUp_button() {

		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();

	}

	@Then("User enters a username")
	public void user_enters_a_username() throws InterruptedException {
		String UsrInput;
		String condn;


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

	}

	@Then("User enters his first-name {string}")
	public void user_enters_his_first_name(String fname) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
	}

	@Then("User enters his last-name {string}")
	public void user_enters_his_last_name(String lname) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
	}

	@Then("User enters a password")
	public void user_enters_a_password() {

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("IndiaJAPS");	    
	}

	@Then("User confirms the password")
	public void user_confirms_the_password() {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("IndiaJAPS");

	}

	@Then("User selects his gender type")
	public void user_selects_his_gender_type() {
		driver.findElement(By.xpath("//span[contains(.,'Male')]")).click();

	}

	@Then("User enters his email id")
	public void user_enters_his_email_id() {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("boomer@zoomer.com");

	}

	@Then("User enters his mobile number")
	public void user_enters_his_mobile_number() {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567891");

	}

	@Then("User enters his DOB")
	public void user_enters_his_DOB() {
		driver.findElement(By.xpath("//input[@placeholder='Date of Birth- mm/dd/yyyy']")).sendKeys("25/12/1965");

	}

	@Then("User enters his address")
	public void user_enters_his_address() {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("xyzx");

	}

	@Then("User opts for a security questuion")
	public void user_opts_for_a_security_questuion() {
		Select SQ = new Select(driver.findElement(By.name("securityQuestion")));
		SQ.selectByIndex(2);

	}

	@Then("User Gives an input for the security question")
	public void user_Gives_an_input_for_the_security_question() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("symba");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String endp = driver.findElement(By.xpath("(//div[@id='errormsg'])[4]")).getText();
		Assert.assertEquals("User Registered Succesfully!!! Please login", endp);	

	}

	@Given("User Registered on the site")
	public void user_Registered_on_the_site() throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	}

	@Then("User clicks on the SignIn button")
	public void user_clicks_on_the_SignIn_button() {

		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

	}

	@Then("User enters his username {string}")
	public void user_enters_his_username(String uname) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);    
	}

	@Then("User enters his password {string}")
	public void user_enters_his_password(String pswrd) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswrd);
	}

	@Then("User clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String endp2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		Assert.assertEquals("Hi, Lalitha SignOut", endp2);	


	}

	@Given("User logged in and wants to buy something")
	public void user_logged_in_and_wants_to_buy_something() throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String endp2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		Assert.assertEquals("Hi, Lalitha SignOut", endp2);


	}


	@Then("User adds an item to cart and completes his payment procedure")
	public void user_adds_an_item_to_cart_and_completes_his_payment_procedure() throws InterruptedException {


		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		String name = driver.findElement(By.xpath("//h4[contains(@class,'nomargin')]")).getText();
		Assert.assertEquals("Headphone", name);		


		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
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

	@Then("Check the presence of cart button")
	public void check_the_presence_of_cart_button() throws InterruptedException {

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String endp2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		Assert.assertEquals("Hi, Lalitha SignOut", endp2);
		boolean b=false;
		
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		boolean d =driver.findElement(By.xpath("//a[@href='displayCart.htm']")).isEnabled();

		if (b=!d) {
			System.out.println("Cart is present");
		}
		else 
			System.out.println("Cart is missing");

	}

}




