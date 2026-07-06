Feature: Create User

  Scenario: Create a new user

    Given user name is "Kevin"
    And user job is "QA"
    When user sends POST request
    Then Response status code should be 201
    And response name should be "Kevin"