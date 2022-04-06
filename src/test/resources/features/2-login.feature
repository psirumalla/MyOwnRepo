@web @login

Feature: Teachable Login Functionality

  Scenario: Login with Valid Credentials
    Given User launch Teachable website
    When User click on Login Link
    And User enters Username
      |Username |
      |takehome@test.com|
    And User enters Password
      |Password |
      |Teachable|
    And Click on Login Button
    Then Verify if User is logged in
    And Close session
