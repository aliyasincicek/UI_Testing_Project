Feature: TC17_Remove Product Cart
  @remove_product
  Scenario: TC17_Remove Product Cart


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Add products to cart
    Then Click View Cart button
    Then Verify that cart page is displayed
    Then Click X button corresponding to particular product
    Then Verify that product is removed from the cart
