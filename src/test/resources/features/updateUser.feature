Feature: Update User API

  Scenario: Update an existing user
    Given User id is 2
    And user name is "Kevin"
    And user job is "Senior QA"
    When user sends PUT request
    Then Response status code should be 200
    And response name should be "Kevin"
    And response job should be "Senior QA"