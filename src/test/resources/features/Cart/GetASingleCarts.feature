Feature: Get a single carts from api DummyJSON
  Scenario Outline: Validate get a single carts with valid page carts
  Given get a single carts with parameter <id>
  When send request get a single carts
  Then status code should be response 200
  And id soulbe be match <id>
    Examples:
    |id|
    |1 |
    |2 |

    Scenario: Get a single carts with invalid id "1999"
      Given get a single carts with parameter 1999
      When send request get a single carts
      Then status code should be response 404
      And Responses body carts should be "Cart with id '1999' not found"

      Scenario: Get a single carts with invalid id alphabet "asdd"
        Given get a single carts with parameter "asdd"
        When send request get a single carts
        Then status code should be response 404
        And Responses body carts should be "Cart with id 'asdd' not found"
