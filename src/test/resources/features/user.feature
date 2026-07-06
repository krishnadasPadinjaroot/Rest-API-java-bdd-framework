Feature: User API

  Scenario: Get User By Id

    Given User id is 2
    When User sends GET request
    Then Response status code should be 200
    And User first name should be "Janet"