package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCasesPage;

public class TestCasesPageStepDefs {
    TestCasesPage testcasesPage=new TestCasesPage();

    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {testcasesPage.testCasesButton.click();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(testcasesPage.testCasesText.isDisplayed());
    }


}
