
@smoke
Feature: User login funchionality 
Scenario: User login using valid credentials
Given User launches in Homepage
When User enters below details
|Username|Password|
|Admin   |admin123|
And User clicks on Login button
Then User dashboard page is visible