Feature: TC25_Verify Scroll Up using Arrow Button Scroll Down
  @scroll_down @vip
  Scenario:  TC25_Verify Scroll using Up Arrow Button Scroll Down


    When Launch browser
    Then Navigate to url
    Then Scroll down to footer
    And Verify text SUBSCRIPTION
    And Click on arrow at bottom right side to move upward
    And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen



  @scroll_up
  Scenario:  TC26_Verify Scroll without using Up Arrow Button Scroll Down


    When Launch browser
    Then Navigate to url
    Then Scroll down to footer
    And Verify text SUBSCRIPTION
    And Scroll up page to top
    And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

