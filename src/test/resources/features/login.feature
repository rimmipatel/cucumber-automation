Feature: Sign up and login functionality

  Background:
    Given user is on landing page
    And user accepts privacy policy

  Scenario Outline: Successful log in with valid credential
    When user clicks sign up or log in button
    Then user should see sign in page
    When user enters email: <emailId> on sign in page
    And user clicks on continue with email button on sign in page
    And user enters password: <pwd> on sign in page
    And user clicks on log in button on sign in page
    Then user should see home page
    Examples:
      | emailId          | pwd      |
      | "testuser@yopmail.com" | "123456" |