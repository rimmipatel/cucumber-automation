Feature: Profile

  Background:
    Given user is on main page
    And user accepts privacy policy
    And user clicks sign up or log in button
    And user enters email: "testuser@yopmail.com" on sign in page
    And user clicks on continue with email button on sign in page
    And user enters password: "123456" on sign in page
    And user clicks on log in button on sign in page

  Scenario Outline: Edit profile
    When user goes to profile setting
    And user enters website: <website> on profile setting page
    And user enters bio: <bio> profile setting page
    And user clicks on save on profile setting page
    And user navigates to home page
    And user goes to his profile
    Then website: <website> should be visible on profile page
    And bio: <bio> should be visible on profile page
    Examples:
      | website       | bio              |
      | "example.com" | "This is my bio" |
