Feature: Parameterization on Demo Web Shop


Background: User will open the browser
 Given User launched the browser
 
@Maybe
Scenario: Validation for Registration on Demo Web Shopxx
Given Site is launched by userxx
Then User provides all the required data for registrationxx
And Proceeds for registrationxx

@Necessity
Scenario Outline: Validation of Login in Demo Web Shopxx
Given Application is launchedxxxx
When User enters the registered valid Username xx "<uname>"
And Valid Password in respective field xx "<pswrd>"
Then Verifies the login statusxx

Examples:
|uname | pswrd     |
|popo@pepe.com  | pepepopo   |
|pepe@popo.com  | pepepopo  |
|shart@popo.com | pepepopo |




