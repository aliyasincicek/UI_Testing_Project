Feature: User contactUs with fill form
  @contact
  Scenario: TC06_User can contact us


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Contact Us button
    Then Verify GET IN TOUCH is visible
    Then Enter name, email, subject and message
    Then Upload file
    Then Click Submit button
    Then Click OK button
    Then Verify success message Success! Your details have been submitted successfully is visible
    Then Click Home' button and verify that landed to home page successfully







