Feature: Login user With Excel

  Scenario: TC03_a_Login_User_With_Correct_email_and_password_with_Excel


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then Enter correct email address and password with excell
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Click logout button


  Scenario: TC03_b_Login_User_With_Wrong_email_and_password_with_Excel


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then Enter incorrect email address and password with excell
    Then Verify error Your email or password is incorrect is visible

