package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

public class DeleteAccountStepDefs {
    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();

    //steps

    @When("Click Continue button")
    public void clickContinueButton() {
        deleteAccountPage.continueButton.click();
    }

    @Then("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        deleteAccountPage.deleteButton.click();
    }

    @Then("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));
    }


}
