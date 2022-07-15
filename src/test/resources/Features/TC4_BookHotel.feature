@book
Feature: Verifying Adactin book hotel details

  Background: 
    Given User is on the Adactin page

  @validBook
  Scenario Outline: verifying Adactin book a hotel page by selecting all fields
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then User should verify search hotel sucessfully "Select Hotel"
    And User should select hotel page
    Then user should verify after select hotel sucessfully "Book A Hotel"
    And User should book hotel "<first_name>","<last_name>" and "<address>"
      | ccNum            | ccType           | expmonth | expyear | cccvv |
      | 0987654321098765 | American Express | January  |    2022 |  0987 |
      | 9087654321890765 | VISA             | February |    2022 |  6789 |
      | 8907654321345678 | Master Card      | March    |    2022 |  5643 |
      | 6789054321456789 | Other            | April    |    2022 |  2345 |
    Then User should verify after book a hotel sucessfully "Booking Confirmation"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room | first_name | last_name | address      |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    | 0 - None   | Chandiran  | chan      | Indira Nager |

  @invalidBook
  Scenario Outline: verifying Adactin book a hotel page without select any fields
    When User should perform login "<username>" and "<password>"
    Then User should verify after login sucessfully "Hello elavarasan1991!"
    And User should perform search hotel "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>" and "<child_room>"
    Then User should verify search hotel sucessfully "Select Hotel"
    And User should select hotel page
    Then user should verify after select hotel sucessfully "Book A Hotel"
    And User should book a hotel without select any fields
    Then After click book now button, User should verify error message from book a hotel page "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number"

    Examples: 
      | username       | password       | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | elavarasan1991 | elavarasan1991 | Sydney   | Hotel Creek | Standard  | 1 - One  | 03/07/2022  | 04/07/2022   | 1 - One    | 0 - None   |
