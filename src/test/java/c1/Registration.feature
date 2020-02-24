Feature: Registering in testmeaoo
@sanity
Scenario Outline: successfull registration
					Given User enters into Registration page
					When User enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirmpassword>" ,  "<email>" , "<mobileno>" , "<dob>" , "<address>" ,"<answer>" 
					Then User navigates to login page
					
					
Examples:
 |username|firstname|lastname|password|confirmpassword|email|mobileno|dob|address|answer|
 |Rashmi123|lali|abc|Password123|Password123|abc@gmail.com|9972152866|10/02/1998|abchgfedhghfr|Bangalore|						