Feature: Get Single Todos From DummyJSON
 Scenario Outline:
   Given  Get single todos with valid id <id>
   When Send request get single todos
   Then Status code should be 200
   And Response Body id Should be <id>

   Examples:
   | id |
   | 1  |
   | 2  |

  Scenario Outline:
    Given  Get single todos with invalid id <id>
    When Send request get single todos
    And Status code should be 404
    Then Response body should be "Todo with id '<id>' not found"

    Examples:
      | id |
      | 255  |
      | 260  |



