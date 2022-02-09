#Author: Monowara Islam
#Date : 01/25/2022
Feature: Suce Demo login

Scenario: Sauce demo valid credentials  
 
    Given  User is a vaild home page
    When user enter valid username standard_user
    When user enter vaild password secret_sauce
    And  user is click login button
    Then user abel read the title and URL of the page
    When user enter valid username locked_out_user
    When user put a password
    And  user should click on login button
    Then user can read the title and URL onthe page
     When user enter valid username problem_user
    When user enter password secret_sauce
    And  user click on the login button
    Then user read the title and URL of the page
     When user enter valid username performance_glitch_user 
    When user write valid password secret_sauce
    And  user should  click on the login
    Then user get the title and URL on the page
    
 
   
    