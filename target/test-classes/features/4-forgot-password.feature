@forgotpassword

Feature: Forgot Password

  Scenario: Forgot Password
    Given User launch Teachable website
    When User click on Login Link
    And User enters Username
      |Username |
      |takehome@test.com|
    And Click on forgot password link
    Then Verify if Reset page is displayed
    And Close session

