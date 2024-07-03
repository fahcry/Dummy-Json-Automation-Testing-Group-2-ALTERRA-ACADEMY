Feature: Delete todos from DummyJson
  Scenario: Delete todos with valid id
    Given Delete todos with id 1
    When Send request delete todos
    Then Status code should be 200