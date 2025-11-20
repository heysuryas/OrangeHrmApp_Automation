
Feature:Add Employee Funchionality
Scenario: Add employee and verify employee in list
  Given User is on Dashboard page
  When User clicks on PIM section
  And User clicks on Add Employee
  And Enter user details
  |FirstName|MiddleName|LastName|Employeeid|
  |John		|		   |Mathew	|81010     |
  And User clicks on Save button
  Then User should see a success message "Successfully Saved"


  When User navigates to Employee List page
  And User enters employee name "John"
  And User clicks on Search button
  Then Employee should be displayed in the results
  
  
  