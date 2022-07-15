@login
Feature: Verifying Adactin Login Hotel details

  Background: 
    Given User is on the Adactin page

  @validlogin
  Scenario Outline: Verifying Adactin login with valid credentials
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"

    Examples: 
      | username       | password       |
      | elavarasan1991 | elavarasan1991 |

  @validenter
  Scenario Outline: Verifying Adactin login with valid credentials with Enter
    When User should perform login "<username>" and "<password>" with enter key
    Then User should verify after login sucessfully "Hello elavarasan1991!"

    Examples: 
      | username       | password       |
      | elavarasan1991 | elavarasan1991 |

  @invalid
  Scenario Outline: Verifying Adactin Hotel login with valid credentials
    When User should perform login "<username>" and "<password>"
    Then User should verify after login error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | username       | password           |
      | elavarasan1991 | elavarasan19914543 |
