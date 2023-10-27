Feature: Login Functionality

Scenario: Login with valid data
Given User has navigate to login page
When User has entered valid emailid  "anilkumar.marolix@gmail.com" into email field
And User has valid password "Anilkumar" into password field
And user has to click on Login button
Then user should get logged in 

Scenario: Login with Invalid data
Given User has navigate to login page
When User has entered invalid emilid "anilkumar23.marolix@gmail.com" into email field
And User has valid password "Anilkumar1" into password field
And user has to click on Login button
Then user should get a proper warning message about data not match

