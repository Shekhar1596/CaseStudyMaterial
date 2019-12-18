Feature: My validation on AWS

Scenario: Validation for Registration on AWS
Given AWS site is up and launched by user
Then User provides all the required data
And Proceeds for the registration

Scenario Outline: Validation of Login in AWS
Given Application is launched
When User enters the registered valid Username "<uname>"
And Valid Password in respective field "<pswrd>"
Then Verifies the login status

Examples:
|uname | pswrd     |
|pepe  | Pass123   |
|popo  | Pass1234  |
|shart | Pass12345 |
|livshitz  | Pass123456|


