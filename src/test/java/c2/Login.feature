

Feature: Login into testmeapp

Scenario Outline: successfull login
		Given user is on login page
		And User enters "<username>" and "<password>" 
		When clicks submit butoon
		Then User does successfull login
 
    Examples: 
      |username  |password   | 
      |Lalitha   |Password123| 
      