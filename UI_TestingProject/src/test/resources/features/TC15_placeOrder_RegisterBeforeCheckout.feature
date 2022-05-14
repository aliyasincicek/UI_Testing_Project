@place_order_before
Feature: TC1_Place Order Register Before Checkout

  Scenario: C15_Place Order Register Before Checkout


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Enter name and email address
    Then Click Signup button
    Then Fill details Title Name Email Password Date of birth
    Then Select checkbox Sign up for our newsletter
    Then Select checkbox Receive special offers from our partners
    Then Fill details First name Last name Company Address Address Country State City Zipcode Mobile Number
    Then Click Create Account button
    Then Verify that ACCOUNT CREATED is visible
    Then Click Continue button
    Then Verify Logged in as username at top
    Then Add products to cart
    Then Click View Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click Continue button
