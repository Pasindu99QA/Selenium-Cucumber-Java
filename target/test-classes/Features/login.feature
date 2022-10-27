Feature: feature to test google search functionality

  Scenario: Validate google serach is working
    Given browser is open
    And user is on google page
    When user enter a text in serach box
    And hits enter
    Then user  is navigated to search result
