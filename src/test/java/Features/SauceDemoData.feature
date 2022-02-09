#Author: Monowara Islam
#Date : 01/25/2022
Feature: Suce demo data
@smoke
  Scenario Outline: Sauce demo singup with data
    Given User is a demo singup page
    When user enter valid username"<username>"
    When user enter vaild password "<password>"
    And user is able to login button
    Then user should be able to login based "<expectedUrl>"                            


    Examples: 
      | username                | password     | expectedUrl                              |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventory.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
