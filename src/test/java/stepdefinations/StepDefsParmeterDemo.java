package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsParmeterDemo {

	@Given("AWS site is up and launched by user")
	public void aws_site_is_up_and_launched_by_user() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Site was launched");
	}

	@Then("User provides all the required data")
	public void user_provides_all_the_required_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("data was provided");
	}

	@Then("Proceeds for the registration")
	public void proceeds_for_the_registration() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("proceeds");
	}

	@Given("Application is launched")
	public void application_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("app was launched");
	}

	@When("User enters the registered valid Username {string}")
	public void user_enters_the_registered_valid_Username(String uname) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("this time the username taken is: "+uname);
	}

	@When("Valid Password in respective field {string}")
	public void valid_Password_in_respective_field(String pswrd) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("this time the password taken is: "+pswrd);
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status(String string) {
		System.out.println("verified");
	}

}
