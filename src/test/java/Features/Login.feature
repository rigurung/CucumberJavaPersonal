Feature: LoginFeature
  This feature deals with the login functionality of the application.

Scenario Outline: Login with correct username and password
  Given I navigate to the login page
  And I enter <UserName> and <Password>
  And I click login button
  Then I should see the user form page

Examples:
    |UserName|Password|
    |admin   |adminPassword|
  |admin2  |password2    |

