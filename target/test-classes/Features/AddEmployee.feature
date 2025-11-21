Feature: Add Employee Functionality
Background:
Given User launches in Homepage
When User enters below details
|Username|Password|
|Admin   |admin123|
And User clicks on Login button
Then User dashboard page is visible



@smoke
Scenario: Add a new employee and verify it appears in the employee list
  Given User is on the Dashboard page
  When User navigates to the PIM module
  And User opens the Add Employee page
  And User provides the employee details:
    | FirstName | LastName | EmployeeID |
    | John      | Mathew   | 1253       |
  And User saves the employee
  Then A success message "Success" should be displayed

  When User navigates to the Employee List page
  And User searches for the employee using:
    | FirstName | LastName | EmployeeID |
    | John      | Mathew   | 1253       |
  And User clicks on Search
  Then The employee record should be displayed in the results
