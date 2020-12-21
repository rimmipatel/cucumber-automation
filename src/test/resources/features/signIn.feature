Feature: Sign up and login functionality

  Background:
    Given user is on main page
    And user accepts privacy policy

  Scenario Outline: Successful log in with valid credential
    When user clicks sign up or log in button
    Then user should see sign in page
    When user enters email: <email> on sign in page
    And user clicks on continue with email button on sign in page
    And user enters password: <pwd> on sign in page
    And user clicks on log in button on sign in page
    Then user should see home page
    Examples:
      | email                  | pwd      |
      | "testuser@yopmail.com" | "123456" |

  Scenario Outline: Unsuccessful log in with invalid credential
    When user clicks sign up or log in button
    Then user should see sign in page
    When user enters email: <email> on sign in page
    And user clicks on continue with email button on sign in page
    And user enters password: <pwd> on sign in page
    And user clicks on log in button on sign in page
    Then user should see error message for invalid credential
    Examples:
      | email                  | pwd    |
      | "testuser@yopmail.com" | "1234" |

  Scenario Outline: Forgot password
    When user clicks sign up or log in button
    Then user should see sign in page
    When user enters email: <email> on sign in page
    And user clicks on continue with email button on sign in page
    And user clicks forgot your password on sign in page
    Then user should see reset password page
    When user enters valid email: <email> to reset password
    And user clicks send new password
    Then user should see successful password reset message
    Examples:
      | email                   |
      | "testuser1@yopmail.com" |
