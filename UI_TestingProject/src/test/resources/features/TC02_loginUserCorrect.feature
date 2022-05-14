Feature: Login user correct
@login  @vip
  Scenario: TC02_a_Login_User_With_Correct_email_and_password


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

