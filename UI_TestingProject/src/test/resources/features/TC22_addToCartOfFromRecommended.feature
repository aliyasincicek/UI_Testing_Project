Feature:TC22_Add to Cart of from Recommended Items

  @recommended_items
  Scenario: TC22_Add to Cart of from Recommended Items


    When Launch browser
    Then Navigate to url
    Then Scroll to bottom of page
    Then Verify RECOMMENDED ITEMS are visible
    Then Click on Add To Cart on Recommended product
    Then Click on View Cart button
    Then Verify that product is displayed in cart page
