Feature: Get All carts from api DummyJSON
  Scenario: Validate get all carts with valid page carts
    Given Get all carts with parameter carts
    When send request get all carts
    Then status code should be response 200
    And id soulbe be match 1



