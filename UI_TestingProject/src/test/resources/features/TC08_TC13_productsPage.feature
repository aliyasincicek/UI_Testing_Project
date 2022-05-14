Feature: Products page feature
  @verifyAllProduct  @vip
  Scenario: TC08_verify all products product detail page


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    Then Click on View Product of first product
    Then User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand


  @verifyProductQuantityCart
  Scenario: TC13_verify product quantity in cart

    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
  Then Click View Product for any product on home page
  Then Verify product detail is opened
  Then Increase quantity to four
  Then Click Add to cart button
  Then Click View Cart button
  Then Verify that product is displayed in cart page with exact quantity
