package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import pages.PlaceOrderCheckoutPage;
import pages.SubscriptionPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class PlaceOrderCheckoutStepDefs {

    PlaceOrderCheckoutPage placeOrderCheckoutPage= new PlaceOrderCheckoutPage();
    SubscriptionPage subscriptionPage=new SubscriptionPage();
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    @Then("Add products to cart")
    public void addProductsToCart() {
        ReusableMethods.jsScroll();
        Random randomNum = new Random();
        int i = randomNum.nextInt(placeOrderCheckoutPage.addToCartButtons.size());
        placeOrderCheckoutPage.addToCartButtons.get(i).click();
    }

    @And("Click Cart button on the homepage")
    public void clickCartButtonOnTheHomepage() {placeOrderCheckoutPage.cartButtonHomePage.click();
    }
    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {Assert.assertEquals(1,subscriptionPage.productsInCart.size());
    }
    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }
    @And("Click Register Login button")
    public void clickRegisterLoginButton() { placeOrderCheckoutPage.registerLoginButton.click();
    }
    @Then("verify that the product has been added to the cart page")
    public void verifyThatTheProductHasBeenAddedToTheCartPage() {
        Assert.assertEquals(1,subscriptionPage.productsInCart.size());
    }
    @And("Enters name and email information in New User Signup")
    public void entersNameAndEmailInformationInNewUserSignup() {
        mainPageFunctionalities.nameBox.sendKeys(Faker.instance().name().fullName());
        mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));
    }
    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(placeOrderCheckoutPage.addressVerificationText.isDisplayed());
    }
    @Then("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        placeOrderCheckoutPage.messageBox.sendKeys("Hello world");
        placeOrderCheckoutPage.placeOrderButton.click();
    }
    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        placeOrderCheckoutPage.nameOnCard.sendKeys("ali");
        placeOrderCheckoutPage.cardNumberBox.sendKeys("12345");
        placeOrderCheckoutPage.cvcBox.sendKeys("546");
        placeOrderCheckoutPage.expirationMonth.sendKeys("10");
        placeOrderCheckoutPage.expirationYear.sendKeys("2025");
    }
    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {placeOrderCheckoutPage.payAndConfirmOrderButton.click();
    }
    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(placeOrderCheckoutPage.orderPlacedText.isDisplayed());

    }
    @Then("Click Delete Account button PlaceOrder")
    public void clickDeleteAccountButtonPlaceOrder() {
        placeOrderCheckoutPage.deleteAccountButton.click();
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        Assert.assertEquals(1,subscriptionPage.productsInCart.size());
    }
}
