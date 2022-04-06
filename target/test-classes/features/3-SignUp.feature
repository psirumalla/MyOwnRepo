@web @signup

Feature: Teachable SignUp Functionality

  Scenario Outline: SignUp Scenario
    Given User launch Teachable website
    When User click on SignUp Link
    And I enter Full Name <FullName>
    And Enter Email <Email>
    And Enter Password <Password>
    And Click on Accept terms
    And Click on Login Button
    And Verify Signup Functionality
    And Close session

    Examples:
      |FullName     |Email                     |Password     |
      |TestName     |TestEm33@yahoo.com        |TestPassword |
      |TestName     |TestEmail@yahoo.com       |TestPassword |
      |TestName     |TestEmail@yahoo.co.in     |Test         |
      |             |TestEm33@yahoo            |TestPassword |
      |Name         |                          |TestPassword |
      |Test         |TtEmail@yahoo.co.in       |             |

