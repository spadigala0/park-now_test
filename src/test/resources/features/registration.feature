# Created by spadigala at 10/03/2021

Feature: Park Now Registration
  This is to test park now registration page.

  Background:
    Given Navigated to environment
    And Accept Cookies

  Scenario: As a new user I want to register with valid details
    Given enter mobile number
    When enter email id
    And enter password "Password123"
    And click on update buttons
    And click on captcha and terms and conditions
    And click on next
#    Then should navigate to verify code page
    Then show warning message

#   Scenario Outline: As a new user i should get an error message  to register with invalid mobile
#      Given enter invalid mobile number "<mobile number>"
#      When enter email id
#      And enter password "Password123"
#      And click on update buttons
#      And click on captcha and terms and conditions
#      And click on next
#      Then validate error message "<error message>" for invalid mobile number
#     Examples:
#     |mobile number|error message|
#     |1234         |Telephone number must be longer than 9 characters      |
#     |abcd         |Mobile number must be numeric|
#     |             |Mobile number is required    |

  Scenario Outline: As a new user i should get an error message  to register with invalid details
    Given enter invalid mobile number "<mobile>"
    When enter email id "<email>"
    And enter password "<password>"
    And click on update buttons
    And click on captcha and terms and conditions
    And click on next
    Then validate error messages "<error4mobile>","<error4email>","<error4password>"
    Examples:
      | mobile | email | password | error4mobile                                      | error4email               | error4password                                 |
      | 1234   | e1    | p1       | Telephone number must be longer than 9 characters | Email address is invalid  | The password does not meet the correct format. |
      | abcd   |       |          | Mobile number must be numeric                     | Email address is required | Password is required                           |
      |        |       |          | Mobile number is required                         | Email address is required | Password is required                           |

  Scenario: As a new user I should get an error message to register without accepting terms and conditions
    Given enter mobile number
    When enter email id
    And enter password "Password123"
    And click on update buttons
    And click on next
    Then show error message "You must agree to the Terms & Conditions"





