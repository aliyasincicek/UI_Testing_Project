Feature: TC18_View Category Products
  @view_category_products
  Scenario: TC18_View Category Products


    When Launch browser
    Then Navigate to url
    And Verify that home page is visible successfully
    Then Verify that categories are visible on left side bar
    Then Click on Women category
    Then Click any category link under the Women category
    Then Verify that category page is displayed
    Then Whichever subheading in the Women category is selected, it validates that category title on the page that opens
    Then Clicks on any category link under the Men category on the left
    Then Whichever subheading in the Men category is selected, it validates that category title on the page that opens
