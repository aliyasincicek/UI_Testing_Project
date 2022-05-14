Feature: TC23_Verify Address Details In checkoutPage
  @verify_address_details
  Scenario: TC23_Verify Address Details In checkoutPage


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Enter name and email address
    Then Click Signup button
    Then Fill details Title Name Email Password Date of birth
    Then Select checkbox Sign up for our newsletter
    Then Select checkbox Receive special offers from our partners
    Then Fills in address information
    Then Click Create Account button
    Then Verify that ACCOUNT CREATED is visible
    Then Click Continue button
    Then Verify Logged in as username at top
    Then Add products to cart
    Then Click View Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    Then Verify that the entered address information is the same
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click Continue button

