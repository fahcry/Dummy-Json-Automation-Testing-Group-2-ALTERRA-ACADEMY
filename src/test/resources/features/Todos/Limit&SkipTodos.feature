Feature: Get Limit & skip todos from DummyJson
  Scenario Outline:Get Limit & skip todos with valid parameters
    Given Get Limit <limit> & Skip <skip> todos with valid parameters
    When  Send request get Limit & skip todos
    Then Status code should be 200

    Examples:
    | limit | skip |
    | 3     | 10   |
    | 5     | 2    |