Feature: Get a single carts from api DummyJSON
  Scenario: Validate get a single carts with valid page carts
  Given get a single carts with parameter 1
  When send request get a single carts
  Then status code should be response 200
  And Validate id soulbe be match 1
  And validate json schema "get_a_single_carts_json_schema.json"

  Scenario: Get a single carts with invalid id "1999"
  Given get a single carts with parameter 1999
  When send request get a single carts
  Then status code should be response 404
  And Responses body carts should be "Cart with id '1999' not found"
  And validate json schema "get_a_single_carts_invalid_number_json_schema.json"

  Scenario: Get a single carts with invalid id alphabet "asdd"
  Given get a single carts with parameter "asdd"
  When send request get a single carts
  Then status code should be response 404
  And Responses body carts should be "Cart with id 'asdd' not found"
  And validate json schema "get_a_single_carts_invalid_alphabet_json_schema.json"