package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {
    FillDetailsPage fillDetailsPage =new FillDetailsPage();

    //steps

    @Then("Fill details Title Name Email Password Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        fillDetailsPage.genderBox.click();
        fillDetailsPage.passwordBox.sendKeys("123456");
        Driver.selectByIndex(fillDetailsPage.dayDropdown,4);
        Driver.selectByIndex(fillDetailsPage.monthDropdown,5);
        Driver.selectByIndex(fillDetailsPage.yearDropdown, 25);
    }

    @Then("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        fillDetailsPage.newsletterSignupBox.click();
    }

    @Then("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        fillDetailsPage.specialOfferBox.click();
    }

    @Then("Fill details First name Last name Company Address Address Country State City Zipcode Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {
        fillDetailsPage.firstNameBox.sendKeys("mario");
        fillDetailsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage.companyBox.sendKeys("Company");
        fillDetailsPage.addressBox.sendKeys(Faker.instance().address().fullAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropdown,2);
        fillDetailsPage.stateBox.sendKeys(Faker.instance().address().state());
        fillDetailsPage.cityBox.sendKeys(Faker.instance().address().city());
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        fillDetailsPage.createAccountButton.click();
    }

    @Then("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(fillDetailsPage.accountCreatedText.isDisplayed());
    }
}
