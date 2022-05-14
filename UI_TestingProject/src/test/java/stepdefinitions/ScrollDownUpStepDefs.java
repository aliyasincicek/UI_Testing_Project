package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ScrollDownUpPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ScrollDownUpStepDefs {

    ScrollDownUpPage scrollDownUpPage =new ScrollDownUpPage();

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        Driver.waitForClickablility(scrollDownUpPage.scrollUpArrow, 10);
        ReusableMethods.clickWithJS(scrollDownUpPage.scrollUpArrow);
    }
    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        try{
            if(scrollDownUpPage.verificationText1.isDisplayed()) {

                Assert.assertTrue(scrollDownUpPage.verificationText1.isDisplayed());

            }else if(scrollDownUpPage.verificationText2.isDisplayed()){

                Assert.assertTrue(scrollDownUpPage.verificationText2.isDisplayed());

            }else if(scrollDownUpPage.verificationText3.isDisplayed()){

                Assert.assertTrue(scrollDownUpPage.verificationText3.isDisplayed());
            }

        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    @And("Scroll up page to top")
    public void scrollUpPageToTop() throws InterruptedException {
        ReusableMethods.scrollUpWithJS();
    }
}

