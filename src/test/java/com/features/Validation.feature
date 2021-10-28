Feature: Login into Application and Validate the WebPage

Scenario: To verify the below validations
Given Initialize the browser with chrome
When URL is opened successfully
Then verify the count of values on the screen
And verify the Total Balance is correct based on the values on the screen
And verify whether the values are greater than zero and are represented as Currencies
And calculate the sum of values and validate the Total Balance