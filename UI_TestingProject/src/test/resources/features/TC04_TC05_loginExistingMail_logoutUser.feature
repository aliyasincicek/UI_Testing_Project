Feature: Login existing Mail and Logout user
  @login
  Scenario: TC04_TC05_Login_User_With_Correct_email_and_password_and_logout


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then   Enter correct email address and password
      |email|password|
      |mariogomez@gmail.com| 123456|
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Click logout button
