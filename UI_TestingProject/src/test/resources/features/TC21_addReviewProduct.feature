@add_review
Feature: TC21_Add Review on Product

  Scenario: TC21_Add Review on Product


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Click on View Product button
    Then Verify Write Your Review is visible
    Then Enter name, email and review
    Then Click Product submit button
    Then Verify success message Thank you for your review

