Feature: Add Two numbers integer

@First
Scenario: Add two numbers direct pass value
Given I want addition
When I enter 2 numbers
Then Sum is displayed as addition 

@Second
Scenario Outline: Add numbers and pass value from examples
Given Enter numbers from data  
When Sum of "<a>" and "<b>"
Then summation is displayed as "<sum> is"
Examples:
|a	|b	| sum	|
|3	|3	|	6	|
|5	|2	|	7	|
|6	|2	|	8	|


