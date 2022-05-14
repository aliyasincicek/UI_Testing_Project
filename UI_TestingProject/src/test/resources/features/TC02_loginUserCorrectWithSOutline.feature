Feature: Login user correct with Scenario Outline

  Scenario Outline: TC02_b_Login_User_With_Correct_email_and_password_used_by_Scenario_Outline


    When Launch browser
    Then Navigate to url
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then kullanici dogru email "<email_address>" ve sifreyi "<password>" girer
    Then Click login button
    Then Verify that Logged in as username is visible

    Examples:
      |email_address  |password|
      |mariogomez@gmail.com|123456|