

Feature: Recruitment Add candidate funchionality 
Scenario: Add candidate on Recuritment module

Given User in Dashboard page

When User clicks on Recruitment module
And click on candidates module
And enters candidate details 
|Fullname |Vacancy |Email| Contact Number|Date of Application|Notes|
And clicks on consent check box
And clicks on save button

When User enters candidate name
And clicks on search button
Then Candidate name is visible 

