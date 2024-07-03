Feature: Get A random todos from DummyJson
  Scenario: Get a random todos with valid json
    Given Get random todos with valid json
    When Send request get random todos
    Then  Status code should be 200

   Scenario Outline: Get Random todos by request match result by user
     Given request to get <result> random todos
     When Send request get request result of random todos
     Then  Status code should be 200
     Examples:
     | result |
     | 1 |
     | 2 |
     |3 |
     |4 |