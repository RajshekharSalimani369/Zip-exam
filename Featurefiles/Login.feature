Feature:Login into zip exam
  Background:
    Given User launch browser
    When User enters admin url "http://iristechsys.com:8082/#/login"

Scenario: Enter user with valid contact number and password
    And User enters valid contact number and password
    And User clicks on login
    Then the expected title of the page should be  "ZipExam"

  Scenario: Enter user with invalid username and password
    And User enters invalid contact number and password
    And User clicks on login
    Then User will view Incorrect credentials message pop-up

    Scenario:Enter user with valid username and invalid password
      And User enters valid contact number and invalid password
      And User clicks on login
      Then User will view Incorrect credentials message pop-up

  Scenario:Enter user with invalid username and invalid password
    And User enters invalid  contact number and invalid password
    And User clicks on login
    Then User will view Incorrect credentials message pop-up




