Feature: Search product

  @search_product
  Scenario: TC_09 search product

    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And  Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible

  @search_product_verify
  Scenario: TC_20 search product verify


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And  Enter product name in search input and click search button
    Then The first product hovers over and clicks add to cart
    Then Click the continue shopping button
    Then Verify Login to your account is visible
    Then   Enter correct email address and password
      |email|password|
      |mariogomez@gmail.com| 123456|
    Then Click login button
    Then Verify that Logged in as username is visible
