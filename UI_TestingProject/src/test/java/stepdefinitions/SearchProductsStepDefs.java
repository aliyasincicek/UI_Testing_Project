package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchProductsPage;

public class SearchProductsStepDefs {

    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @Then("kullanici product page de iken cart butona tiklar")
    public void kullanici_product_page_de_iken_cart_butona_tiklar() {
        searchProductsPage.cartButtonHomePage.click();

    }
    @Then("kullanici cart page in gorunur oldugunu test eder")
    public void kullanici_cart_page_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(searchProductsPage.shoppingCartText.isDisplayed());
    }
    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        searchProductsPage.searchProduct.sendKeys("Blue Top");
        searchProductsPage.searchButton.click();
    }
    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(searchProductsPage.searchedProductsText.isDisplayed());
    }
    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(searchProductsPage.blueTop.isDisplayed());
    }
}
