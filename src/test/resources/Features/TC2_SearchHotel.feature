@search
Feature: Verifying Adactin search Hotel details in adactin application

  Background: 
    Given User is on the Adactin page

  @validsearch
  Scenario Outline: verifying Adactin search hotel page by select all valid fields
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then User should verify search hotel sucessfully "Select Hotel"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    | 0 - None   |

  @madsearch
  Scenario Outline: Verifying Adactin search hotel by select only mandatory fields
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<room_nos>","<datepick_in>","<datepick_out>", and "<adult_room>"
    Then User should verify search hotel sucessfully "Select Hotel"

    Examples: 
      | username       | password       | location | room_nos | datepick_in | datepick_out | adult_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    |

  @datesearch
  Scenario Outline: Verifying Adactin search hotel with date checking
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then After searching, User should verify with date error message from search hotel page "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2024  | 04/07/2022   | 1 - One    | 0 - None   |

  @withoutsearch
  Scenario Outline: Verifying Adactin search hotel to without enter any fields
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel
    Then After searching, User should verify with location error message from search hotel page "Please Select a Location"

    Examples: 
      | username       | password       |
      | elavarasan1991 | elavarasan1991 |
