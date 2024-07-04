Feature: Delete a cart
  Scenario: Validate delete a cart with valid data
  Given Delete cart with id 1
  When send request delete cart
  Then status code should be response 200