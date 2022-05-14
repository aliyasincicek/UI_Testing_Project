Feature: TC_24  Download Invoice after purchase order

  @download_invoice
  Scenario: TC_24  Download Invoice after purchase order


    When Launch browser
    Then Navigate to url
    Then Add products to cart
    Then Click the continue shopping button
    Then Click Cart button on the homepage
    Then Verify that cart page is displayed
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
    When Click Continue button
    Then Verify that Logged in as username is visible
    And Click Cart button
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    Then Click Download Invoice button
    And verify invoice is downloaded successfully
    Then Click Continue button
    Then Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click Continue button




