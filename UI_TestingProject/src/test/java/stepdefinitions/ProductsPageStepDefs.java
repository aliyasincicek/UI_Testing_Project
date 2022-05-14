package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ProductsPage;
import pages.SubscriptionPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class ProductsPageStepDefs {

    ProductsPage productsPage = new ProductsPage();
    SubscriptionPage subscriptionPage = new SubscriptionPage();
    Random randomNum = new Random(); //bircok kez kullanacagiz, class seviyesinde yaptik
    Actions actions = new Actions(Driver.getDriver());

    //TC08_verify all products product detail page

    @Then("Click on Products button")
    public void clickOnProductsButton() {productsPage.productButton.click();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(productsPage.allProductsText.isDisplayed());
    }
    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        Assert.assertEquals(34, productsPage.productList.size());
    }
    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        productsPage.viewProductButton1.click();
    }
    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(productsPage.ProductName.isDisplayed());
        Assert.assertTrue(productsPage.Category.isDisplayed());
        Assert.assertTrue(productsPage.Price.isDisplayed());
        Assert.assertTrue(productsPage.Availability.isDisplayed());
        Assert.assertTrue(productsPage.Condition.isDisplayed());
        Assert.assertTrue(productsPage.Brand.isDisplayed());
    }
    //TC12_Add Products in Cart

    @Then("The first product hovers over and clicks add to cart")
    public void theFirstProductHoversOverAndClicksAddToCart() {
        ReusableMethods.hover(subscriptionPage.firstProduct);
        Driver.wait(4);
        subscriptionPage.addToCartButton.click();
        Driver.wait(4);
    }
    @Then("Click the continue shopping button")
    public void clickTheContinueShoppingButton() {
        subscriptionPage.continueButton.click();
    }

    @And("the second product hovers over and clicks add to cart")
    public void theSecondProductHoversOverAndClicksAddToCart() {
        Driver.wait(4);
        ReusableMethods.hover(subscriptionPage.secondProduct);
        Driver.wait(4);
        subscriptionPage.addToCartButton2.click();
    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {Assert.assertEquals(2, subscriptionPage.productsInCart.size());
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        //Price-> Rs.500     quantity -> 1      Total -> Rs.500
        int firstPrice = Integer.parseInt(subscriptionPage.firstPrice.getText().replaceAll("[^0-9]", ""));

        int secondPrice = Integer.parseInt(subscriptionPage.secondPrice.getText().replaceAll("[^0-9]", ""));

        String firstTotalPrice = subscriptionPage.firstTotolPrice.getText().replaceAll("[^0-9]", "");

        String secondTotalPrice = subscriptionPage.secondTotolPrice.getText().replaceAll("[^0-9]", "");

        Assert.assertEquals(500, firstPrice);
        Assert.assertEquals(400, secondPrice);
        Assert.assertEquals("1", subscriptionPage.firstQuantity.getText());
        Assert.assertEquals("1", subscriptionPage.secondQuantity.getText());
        Assert.assertEquals("500", firstTotalPrice);
        Assert.assertEquals("400", secondTotalPrice);
    }
    @Then("kullanici view cart butona tiklar")
    public void kullanici_view_cart_butona_tiklar() {
        subscriptionPage.cartButton.click();
    }

    @Then("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        int i = randomNum.nextInt(productsPage.viewProductHomePage.size());
        productsPage.viewProductHomePage.get(i).click();
        Driver.wait(4);
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        String titlePage = Driver.getDriver().getTitle();
        System.out.println("titlePage = " + titlePage);
        Driver.wait(4);
        Assert.assertTrue(titlePage.contains("Product Details"));
    }

    @Then("Increase quantity to four")
    public void increaseQuantityToFour() {
        productsPage.quantityBox.clear();
        productsPage.quantityBox.sendKeys("4");
    }

    @Then("Click Add to cart button")
    public void clickAddToCartButton() {productsPage.addToCartButtonProduct.click();
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {productsPage.viewCartButtonProduct.click();
        Driver.wait(4);
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        String quantity = productsPage.quantityBoxInCart.getText();
        Driver.wait(4);
        Assert.assertEquals("4", quantity);
    }

    //TC17_Remove Product Cart
    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        Driver.wait(2);
        productsPage.deleteButton_first.click();
        Driver.wait(2);
    }
    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        Driver.wait(1);
        Assert.assertTrue(productsPage.cartEmptyText.isDisplayed());
    }
       //TC18_View Category Products

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        actions.sendKeys(Keys.PAGE_DOWN);
        Driver.wait(2);
        Assert.assertTrue(productsPage.categoryText.isDisplayed());
        Driver.wait(2);
    }

    @Then("Click on Women category")
    public void clickOnWomenCategory() {
        productsPage.womanCategory.click();
    }

    @Then("Click any category link under the Women category")
    public void clickAnyCategoryLinkUnderTheWomenCategory() {
        int i = randomNum.nextInt(productsPage.womenSubCategories.size());
        productsPage.womenSubCategories.get(i).click();
    }
    @Then("Verify that category page is displayed")
    public void verifyThatCategoryPageIsDisplayed() {
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }
    @Then("Whichever subheading in the Women category is selected, it validates that category title on the page that opens")
    public void whicheverSubheadingInTheWomenCategoryIsSelectedItValidatesThatCategoryTitleOnThePageThatOpens() {
        productsPage.womanCategory.click();
        int i = randomNum.nextInt(productsPage.womenSubCategories.size());
        productsPage.womenSubCategories.get(i).click();
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }
    @Then("Clicks on any category link under the Men category on the left")
    public void clicksOnAnyCategoryLinkUnderTheMenCategoryOnTheLeft() {
        int i = randomNum.nextInt(productsPage.menSubCategories.size());
        productsPage.menSubCategories.get(i).click();
    }

    @Then("Whichever subheading in the Men category is selected, it validates that category title on the page that opens")
    public void whicheverSubheadingInTheMenCategoryIsSelectedItValidatesThatCategoryTitleOnThePageThatOpens() {
        int i = randomNum.nextInt(productsPage.menSubCategories.size());
        productsPage.menSubCategories.get(i).click();
    }
    @Then("kullanici Men kategorisindeki hangi alt basligi secerse, acilan sayfada ona gore kategori basligi test eder")
    public void kullaniciMenKategorisindekiHangiAltBasligiSecerseAcilanSayfadaOnaGoreKategoriBasligiTestEder() {
        productsPage.menCategory.click();
        int i = randomNum.nextInt(productsPage.menSubCategories.size());
        productsPage.menSubCategories.get(i).click();
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }


    //TC19_View And Cart Brand Products
    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertTrue(productsPage.brands.isDisplayed());
        System.out.println("brands size :" + productsPage.brandsList.size()); //1
    }
    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        actions.sendKeys(Keys.PAGE_DOWN);
        int randomSelect = randomNum.nextInt(productsPage.brandsList.size());
        productsPage.brandsList.get(randomSelect).click();
    }
    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }
    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        productsPage.hmproducts.click();
    }
    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }

    //TC21_Add Review on Product

    @Then("Click on View Product button")
    public void clickOnViewProductButton() {
        productsPage.viewProductButton1.click();
    }

    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertTrue(productsPage.productReview.isDisplayed());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview() {
        productsPage.nameBox.sendKeys(Faker.instance().name().fullName());
        productsPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        productsPage.reviewArea.sendKeys("I love your products...");
    }

    @Then("Verify success message Thank you for your review")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertTrue(productsPage.successMessage.isDisplayed());
    }
    @Then("Click Product submit button")
    public void clickProductSubmitButton() {
        productsPage.submitButton.click();
    }
    //TC22_Add to Cart of from Recommended Items

    @Then("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        ReusableMethods.scrollToElement(productsPage.recommendedItems);
    }
    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(productsPage.recommendedItems.isDisplayed());
    }
    @Then("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        Driver.wait(3);
        productsPage.recommendedAddToCart.click();
        Driver.wait(3);
    }
    @Then("Click on View Cart button")
    public void clickOnViewCartButton() {
        productsPage.viewCart.click();
    }
}