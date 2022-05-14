package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SubscriptionPage;
import utilities.ReusableMethods;

public class SubscriptionStepDefs {

    SubscriptionPage subscriptionPage=new SubscriptionPage();

    //TC10_subscription_in_home_page
    @And("Scroll down to footer")
    public void scrollDownToFooter() {ReusableMethods.jsScroll();
    }
    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {Assert.assertTrue(subscriptionPage.subciptionText.isDisplayed());
    }
    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        subscriptionPage.susbscribeEmail.sendKeys("mariogomez@gmail.com");
        subscriptionPage.susbscribeArrowButton.click();
    }
    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertTrue(subscriptionPage.susbscribeSuccessMessage.isDisplayed());
    }

    //TC11_subscription_in_cart_page

    @And("Click Cart button")
    public void clickCartButton() {subscriptionPage.cartButton.click();
    }
}
