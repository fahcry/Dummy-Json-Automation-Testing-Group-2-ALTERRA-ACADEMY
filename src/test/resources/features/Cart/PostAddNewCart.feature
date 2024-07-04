Feature: Post Add a new cart from api DummyJSON
  Scenario Outline: Validate post Add a new cart with valid data
    Given Create Add a new cart with file json "<filename>"
    When send request post add a new cart
    Then status code should be response 201
    And Validate id soulbe be match 51
    And validate json schema "add_a_new_cart_json_schema.json"
  Examples:
    | filename                |
    | add_a_new_cart.json     |
    
    Scenario Outline: Post Add a new cart with invalid data userId "a"
      Given Create Add a new cart with file json "<filename>"
      When send request post add a new cart
      Then status code should be response 400
      And Responses body carts should be "Invalid user id 'a'"
      And validate json schema "add_a_new_cart_alphabet_json_schema.json"
    Examples:
      |filename                             |
      |add_a_new_cart_invalid_alphabet.json |

    Scenario Outline: Post Add a new cart with invalid data userId symbol "#"
      Given Create Add a new cart with file json "<filename>"
      When send request post add a new cart
      Then status code should be response 400
      And Responses body carts should be "Invalid user id '#'"
      And validate json schema "add_a_new_cart_json_schema_invalid_symbol.json"
      Examples:
        |filename                             |
        |add_a_new_cart_invalid_symbol.json   |