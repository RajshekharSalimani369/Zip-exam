Feature: Add a exam
  Background:
    Given User launch browser
    When User enters admin url "http://iristechsys.com:8082/#/login"
    And User enters valid contact number and password
    And User clicks on login
    Then the expected title of the page should be  "ZipExam"
    When User clicks on Add Exam option
    And User selects add exam from the list

  Scenario: Add a exam with valid data
    When User enters data in the exam name textbox
    And User enters data in duration textbox
    And User enters in target audience
    And User enters in Instruction textbox
    And User clicks on Submit


  Scenario: Try adding a exam without data
    And User clicks on Submit