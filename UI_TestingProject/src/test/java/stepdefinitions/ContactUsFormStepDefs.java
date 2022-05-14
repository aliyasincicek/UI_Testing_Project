package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactUsFormPage;
import utilities.Driver;

public class ContactUsFormStepDefs {

    ContactUsFormPage contactUsFormPage=new ContactUsFormPage();

    @Then("Click on Contact Us button")
    public void clickOnContactUsButton() {contactUsFormPage.contactUsButton.click();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {Assert.assertTrue(contactUsFormPage.getInTouchText.isDisplayed());
    }

    @Then("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        //    contactUsFormPage.nameText.sendKeys(Faker.instance().name().firstName());
        //    contactUsFormPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        //    contactUsFormPage.subjectBox.sendKeys("hello");

        Driver.waitAndSendText(contactUsFormPage.nameText,Faker.instance().name().firstName() );
        Driver.waitAndSendText(contactUsFormPage.emailBox,Faker.instance().internet().emailAddress());
        Driver.waitAndSendText(contactUsFormPage.subjectBox, "hello");
        Driver.waitAndSendText(contactUsFormPage.messageBox, "you will never walk alone");
    }

    @Then("Upload file")
    public void uploadFile() {
        // String pathOfImage = "src/test/resources/testData/testData.xlsx";
       // String pathOfImage = System.getProperty("user.home")+"..dosya yolu...."
        String pathOfImage = "C:\\Users\\asus\\IdeaProjects\\practiceCucumber_automationexercise\\src\\test\\resources\\testData\\imageUpload.jpg";
        Driver.waitAndSendText(contactUsFormPage.uploadFile, pathOfImage);
    }

    @Then("Click Submit button")
    public void clickSubmitButton() {contactUsFormPage.submitFile.click();
    }

    @Then("Click OK button")
    public void clickOKButton() {Driver.wait(3);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify success message Success! Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(contactUsFormPage.successMessage.isDisplayed());
    }

    @Then("Click Home' button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsFormPage.homeButton.click();
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("automationexercise", pageTitle);
    }
}
