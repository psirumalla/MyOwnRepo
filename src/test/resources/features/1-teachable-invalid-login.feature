//N number of scenarios with n number of permutations and combinations can be added based on business requirements and exploratory scenarios
@invalidLogin
Feature: Teachable Login Functionality

  Scenario Outline: Login Functionality with invalid credentials
    Given User launch Teachable website
    When User click on Login Link
    And Enter username <Username>
    And Enter password <Password>
    And Click on Login Button
    And Verify if error is displayed
    And Close session

    Examples:
      |Username            |Password |
      |takehome@test.com   |Teachble|
      |takehome  |Teachble123@|
      |takehome@test.com   |    |
      |takehome            |null|
      |techable@test.com   |Teable1234|
      |takehome@yahoo.com  |Teachble|
      |welcome@gmail.comm  |Tehble|
      |takehome@test.co.in |Teachable|
      |                    |Teachble|
      |takehome@test.co.in |        |
      |takehome@test.com   |null    |
      |                    |         |
      |takehome@test.com   |123Teachble|
      |takehome@test.co.in |Teachable123|
      |takehome@test.com   |Teac@4hble|
      |takehome@test.co.uk |Teachable|
      |000000  |Teac@4hble|
      |null|12345689|
      |@&*&(*   |0000000000|
      |takehome@test.gov |Table|
      |0045500@yahoo.com |Teac@4hble|
      |null|12345689|
      |@&*&(* @gmail.com  |00000|

