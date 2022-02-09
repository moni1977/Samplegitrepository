#author Monowara Islam
# date 01/23/2022
Feature: Help Page navigating.

  Scenario: Yahoo singup Help page navigating.
    Given User is in create login page
    When user is click on help page
    When user  is validate  display under Browese BY TOPIc
    Then user is able to read the text
    Then user  is validate  display Passwordand sing in
    Then user is able to read the text
    And user  is validate  display Account key
    Then user is able to read the text
    And user  is validate  display Account security
    Then user is able to read the text
    And user  is validate  display Create or delete account
    Then user is able to read the text
    And user  is validate  display Manage account setting
    Then user is able to read the text
    And user  is validate  display Accessibility
    Then user is able to read the text
    And user  is validate  display Yahoo policy
    Then user is able to read the text
