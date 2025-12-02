
Feature: Recruitment Add candidate funchionality 


@smoke @login
Scenario: Add candidate on Recuritment module
Given User in Dashboard page
When User clicks on Recruitment module
And click on Add module
And enters candidate details 
|Fullname |Lastname|Vacancy |Email  | 
|Swathy |S|Software Engineer | swathy@gmail.com| 
And clicks on consent check box
And clicks on save button
Then success message will displayed


When User enters candidate name
|Name|
|Swathy|
And clicks on search button
Then Candidate name is visible 



