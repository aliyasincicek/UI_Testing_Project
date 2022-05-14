Feature: Verify Subscription In Home Page

  @verify_subscription_in_homepage
  Scenario: TC10_Verify Subscription In Home Page


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible

      @verify_subscription_in_cart_page
  Scenario: TC11_Verify Subscription In Cart


        When Launch browser
        Then Navigate to url
        Then Verify that home page is visible successfully
        And  Click Cart button
        And Verify text SUBSCRIPTION
        And Enter email address in input and click arrow button
        And Verify success message You have been successfully subscribed! is visible
