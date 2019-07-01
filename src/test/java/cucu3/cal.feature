Feature: Test Calculator
  This file describes calculator functionality
  
  Scenario Outline: Calculator functions
    Given I enter <value> in the calculator
    And I press "<function>"
    And I have entered <anothervalue> in the calculator
    When I press equal symbol
    Then The result should be <answer> on the screen
    Examples: 
      | value  | function | anothervalue  |answer |
      |  10    |  add     |    20         | 30    |
      |  30    |  sub     |    20      		| 10    |    
      |  30    |  mul     |    4					| 120   |