Feature: Add Products in Cart

  @add_products_to_cart
  Scenario: TC12_Add Products in Cart

    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then The first product hovers over and clicks add to cart
    Then Click the continue shopping button
    And the second product hovers over and clicks add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price
