Feature: Login on DemoWebShop

@Smoke
Scenario: User access Register on the website 
Given DemoWebShop website is launched
And User clicks on the Register button
When User enters proper data for registration
Then User clicks on submit button for account creation

@Necessity
Scenario: User clicks on sign-in button
Given Registered user clicks on signIn link
Then User provides valid data for login input fields
And clicks on submit button for the login  validation

@Maybe
Scenario: User searches for the product
Given User is on home page
Then User clicks on search tab
And User searches for the product

@Haveto
Scenario: User adds product in the cart
Given The search product is available
Then User adds in the cart

