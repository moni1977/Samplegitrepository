#author Monowara Islam
# date 01/23/2022
Feature: Yahoosingup data
@UAT
  Scenario Outline: Yahoo singup data test
    Given user is on click login page
    When user  is enters firstname"<firstname>"
    When user is enters lastname"<lastname>"
    When user is enters emailaddress"<emailaddress>"
    When user is enters password"<password>"
    And user select country code"<countrycode>"
    And user enter phone number"<phonenumber>"
    And user click date of birthmonth"<birthmonth>"
    And user enter date"<date>"
    And user enter year"<year>"
    And user enter gender"<gender>"
    Then user should able based on "<expectedUrl>"

    Examples: 
      | firstname | lastname | emailaddress | password     | countrycode | phonenumber | birthmonth | date | year | gender | expectedUrl                            |
      | Moni      | islam    | moiuuytiu876 | Mouyvbv56543 | Bangladesh  |  3478997765 | April      |   23 | 2009 | F      | https://login.yahoo.com/account/create |
