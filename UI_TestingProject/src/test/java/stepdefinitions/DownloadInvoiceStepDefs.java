package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DownloadInvoicePage;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DownloadInvoiceStepDefs {
    DownloadInvoicePage downloadInvoicePage=new DownloadInvoicePage();

    @And("verify invoice is downloaded successfully")
    public void verifyInvoiceIsDownloadedSuccessfully() {
        Driver.wait(5);

        String date = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
        String expectedPath = System.getProperty("user.dir") + "/Downloads/invoice.txt";

        boolean doesExist = Files.exists(Paths.get(expectedPath));
        Assert.assertTrue(doesExist);
    }

    @Then("Click Download Invoice button")
    public void clickDownloadInvoiceButton() {
        downloadInvoicePage.downloadInvoice.click();
    }
}
