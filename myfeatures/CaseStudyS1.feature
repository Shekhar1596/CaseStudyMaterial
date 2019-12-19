Feature: Parameterization on TestMeApp


Background: Launch the browser
 Given Browser launched
 And Launch the website
 
#Case Study 1
Scenario Outline: Registration of a user on TestMeApp
Given User launched the website
Then User clicks on the SignUp button
Then User enters a username
Then User enters his first-name "<fname>"
Then User enters his last-name "<lname>"
Then User enters a password
Then User confirms the password
Then User selects his gender type
Then User enters his email id
Then User enters his mobile number
Then User enters his DOB
Then User enters his address
Then User opts for a security questuion
Then User Gives an input for the security question
Then User clicks on the Register button

Examples:
|fname | lname     |
|shart | pepepopo  |


#Case Study 2
Scenario Outline: Login aspect of TestMeApp
Given User Registered on the site
Then User clicks on the SignIn button
Then User enters his username "<uname>"
Then User enters his password "<pswrd>"
Then User clicks the login button

Examples:
|uname | pswrd     |
|Lalitha  | Password123  |


#Case Study 3
Scenario: Adding to cart and then checking out aspect of TestMeApp
Given User logged in and wants to buy something
Then User adds an item to cart and completes his payment procedure


#Case Study 4
Scenario: Check if cart butoon is there or not irrespective of adding an item to  it
Given User logged in and wants to buy something
Then Check the presence of cart button

