@select
Feature: Verifying Adactin select Hotel details

  Background: 
    Given User is on the Adactin page

  @validselect
  Scenario Outline: verifying Adactin select hotel page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then User should verify search hotel sucessfully "Select Hotel"
    And User should select hotel page
    Then user should verify after select hotel sucessfully "Book A Hotel"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    | 0 - None   |

  @invalidselect
  Scenario Outline: verifying Adactin select hotel page on without click radiobutton
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then User should verify search hotel sucessfully "Select Hotel"
    And User should click continue button without select any hotel
    Then After click continue button, user should verify with error message from select hotel page "Please Select a Hotel"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    | 0 - None   |
