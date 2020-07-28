@Create_test

Feature: Create a new user

  Background:
    Given User is on the landing page
    Then user click the Users button


  Scenario: Create new user
    And  user click new user button
    Then user enter "Username" as "serkanserdar61"
    Then user enter "Password" as "ser615534"
    Then user enter "Email" as "serkanserdarusa@gmail.com"

    Then user click "Create User" button


  Scenario Outline: Filters with Username
    Then user select "<dropdown>" and enters "<text>" from "Username"
    And user click Filter button

    Examples: dropdown and text
      | dropdown    | text           |
      | Contains    | serdar61       |
      | Equals      | serkanserdar61 |
      | Starts with | serkan         |
      | Ends with   | dar61          |


  Scenario Outline: Filters with Email
    Then  user select "<email>" and enters "<text1>" from "Email"
    And user click Filter button

    Examples: Email and text
      | email       | text1                     |
      | ssssssss    | serdarusa                 |
      | Equals      | serkanserdarusa@gmail.com |
      | Starts with | serkan                    |
      | Ends with   | darusa@gmail.com          |


