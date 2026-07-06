Feature: Delete User API

  Scenario: Delete an existing user
    Given User id is 2
    When user sends DELETE request
    Then Response status code should be 204