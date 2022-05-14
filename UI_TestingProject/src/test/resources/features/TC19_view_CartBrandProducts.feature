Feature: View And Cart Brand Products

@brands_products
Scenario: TC19_View And Cart Brand Products


  When Launch browser
  Then Navigate to url
  And Verify that home page is visible successfully
  And Click on Products button
  And Verify that Brands are visible on left side bar
  And Click on any brand name
  And Verify that user is navigated to brand page and brand products are displayed
  And On left side bar, click on any other brand link
  And Verify that user is navigated to that brand page and can see products

