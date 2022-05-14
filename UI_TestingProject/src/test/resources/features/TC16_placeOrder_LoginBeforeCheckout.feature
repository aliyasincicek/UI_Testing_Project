@place_order_login_before_checkout
Feature:TC16_Place Order Login Before Checkout

  Scenario: TC16_Place Order Login Before Checkout


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then   Enter correct email address and password
      |email|password|
      |mariogomez@gmail.com| 123456|
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Add products to cart
    Then Click View Cart button
    Then Verify that cart page is displayed
    And  Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click Continue button


