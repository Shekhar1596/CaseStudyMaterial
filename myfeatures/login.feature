Feature: my validation on mercury application
@Sanity @UAT
Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on sign up button
When user enters prpoer data
Then clicks ob submit button for account creation
@Regression @Sanity @UAT
Scenario: user access to signup in Login for registration Member
Given registered user clicks on signIn link
Then he provides valid data for login input fields
And clicks on submit button for the login  validation
@Smoke
Scenario: user access to signup in Book Flight
Given user verifies the flights available
Then selects the desired flight 
When user makes payments
Then tickets are generated


