Feature: Put Update a cart
  Scenario Outline: Validate put Update a cart with valid data
  Given update a cart with valid parameter id 1 json "<filename>"
  When send request put update a cart
  Then status code should be response 200
  And id soulbe be match <id>

    Examples:
      |filename           |id|
      |update_a_cart.json |1 |