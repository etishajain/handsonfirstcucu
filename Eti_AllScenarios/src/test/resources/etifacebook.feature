@Important
Feature:This is for testing of all the scenarios of Facebook

@Smoke 
Scenario:  Facebook Login page
Given Facebook page is open
When  User enter following
|uname		| pwd				|
|etisha  	| eti123		|
|Amisha 	| ami123		|
|Johns 		| john123		|



@Smoke
Scenario Outline: Login Bla bla car
Given Login for bla bla car
When login email id is "<email>" 
When password is "<pwd>"
Examples:
		| email 			| pwd |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 | 


@SmokeTest @RegressionTestTag
Scenario: Google Search
Given Google should open
When user enter "Analysis" in search box

