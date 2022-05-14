package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    //steps

    @When("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }

    @Then("Navigate to url")
    public void navigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);
    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        mainPageFunctionalities.signupButton.click();
    }

    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {
        mainPageFunctionalities.nameBox.sendKeys("mario");
        mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        mainPageFunctionalities.accountCreatSignupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());
    }
}
