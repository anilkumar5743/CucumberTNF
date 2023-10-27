Feature: Register Functionality

Scenario: User create an account with only mandatory fields
Given User navigate to register page
When User enter below feilds
|firstname |chinna|
|lastname  |kadiyala|
|email     |anilkumar.marolix@gmail.com|
|email     |anilkumar.marolix@gmail.com|
|Telephone |1234567890|
|password  |Anilkumar|
And User select policy
And User clicks on continue button
Then User account register successfully

Scenario: User create an account with all mandatory fields
Given User navigate to register page
When User enter below feilds
|firstname |chinna|
|lastname  |kadiyala|
|email     |anilkumar.marolix@gmail.com|
|email     |anilkumar.marolix@gmail.com|
|Telephone |1234567890|
|password  |Anilkumar|
And User select yes of news letter 
And User select policy
And User clicks on continue button
Then User account register successfully