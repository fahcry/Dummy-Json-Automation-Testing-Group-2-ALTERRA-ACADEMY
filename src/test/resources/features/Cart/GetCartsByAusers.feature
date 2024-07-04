Feature: Get carts by a user from api DummyJSON
  Scenario: Validate Get carts by a user with valid page carts
    Given get a carts by a user with parameter 5
    When send request get carts by a user
    Then status code should be response 200

    Scenario: Get a carts by a user with invalid id "1999"
      Given get a carts by a user with parameter 1999
      When send request get carts by a user
      Then status code should be response 404
      And Responses body carts should be "User with id '1999' not found"

#      BUG??
      Scenario: Get a carts by a user with invalid id simbol "#$"
        Given get a carts by a user with parameter "#$"
        When send request get carts by a user
        Then status code should be response 404
        And Responses body carts should be "Cart with id 'user' not found"

#        BUG??
        Scenario: Get carts by a user from api DummyJSON
          Given get a carts by a user with parameter "asdd"
          When send request get carts by a user
          Then status code should be response 404
          And Responses body carts should be "Invalid user id 'asdd'"

    Scenario: Get a carts by a user with invalid id "space"
      Given get a carts by a user with parameter " "
      When send request get carts by a user
      Then status code should be response 404
      And Responses body carts should be "User with id ' ' not found"
