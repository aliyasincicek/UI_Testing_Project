@place_order_while
Feature: TC14_Place Order Register while Checkout

  Scenario: C14_Place Order Register while Checkout


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Add products to cart
    Then Click the continue shopping button
    And  Click Cart button on the homepage
    And  Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register Login button
    Then verify that the product has been added to the cart page
    And Click Proceed To Checkout
    And Click Register Login button
    And Enters name and email information in New User Signup
    And Click Signup button
    Then Fill details Title Name Email Password Date of birth
    Then Select checkbox Sign up for our newsletter
    Then Select checkbox Receive special offers from our partners
    Then Fill details First name Last name Company Address Address Country State City Zipcode Mobile Number
    Then Click Create Account button
    Then Verify that ACCOUNT CREATED is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Cart button on the homepage
    And Click Proceed To Checkout
    Then Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    Then Click Delete Account button PlaceOrder
    Then Verify ACCOUNT DELETED! and click Continue button