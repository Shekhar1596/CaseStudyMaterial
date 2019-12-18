package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mercurydefinations {

	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Mercury website is launched");
	}

	@Given("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User clicked the sign up button");
	}

	@When("user enters prpoer data")
	public void user_enters_prpoer_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User entered the data");
	}

	@Then("clicks ob submit button for account creation")
	public void clicks_ob_submit_button_for_account_creation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User clicked on the submit button");
	}

	@Given("registered user clicks on signIn link")
	public void registered_user_clicks_on_signIn_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User clicked the sign in button");
	}

	@Then("he provides valid data for login input fields")
	public void he_provides_valid_data_for_login_input_fields() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User provided the login credentials");
	}

	@Then("clicks on submit button for the login  validation")
	public void clicks_on_submit_button_for_the_login_validation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User clicked the login button");
	}

	@Given("user verifies the flights available")
	public void user_verifies_the_flights_available() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User verified the flight available");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User selected the desired flight");
	}

	@When("user makes payments")
	public void user_makes_payments() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("User payed for the tickets");
	}

	@Then("tickets are generated")
	public void tickets_are_generated() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("The tickets got generated");
	}

}
