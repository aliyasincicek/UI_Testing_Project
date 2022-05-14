package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    String path = "src/test/resources/testData/testData.xlsx";
    String sheetName = "Sayfa1";
    ExcelUtil excelUtil =new ExcelUtil(path,sheetName);

    List<Map<String, String>> loginData = excelUtil.getDataList();

    LoginPage loginPage=new LoginPage();

    //steps

    @Then("kullanici dogru email {string} ve sifreyi {string} girer")
    public void kullaniciDogruEmailVeSifreyiGirer(String email, String psw) {
        loginPage.loginemailElement.sendKeys(email);
        loginPage.loginPasswordBox.sendKeys(psw);
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }

    @Then("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String> loginCredentials = dataTable.row(1); // datatable row lari 1 den basalar
        // datatable in credential lari  bir nevi  sifirinci satirdadir diyebiliriz..
        // data table daki 1. satir daki ilk eleman 0. index gibi alinir.. yanindaki de 1. idexdir..
        // feature dosyasinda hangi methoda aitse data table daki datalari cagirmak icin bu sekilde kullanim mevcuttur
        loginPage.loginemailElement.sendKeys(loginCredentials.get(0)); //practicebatch44@gmail.com
        loginPage.loginPasswordBox.sendKeys(loginCredentials.get(1)); //123456
    }

    @Then("Click login button")
    public void clickLoginButton() {loginPage.loginButton.click();
    }
    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("Enter correct email address and password with excell")
    public void enterCorrectEmailAddressAndPasswordWithExcell() {
        //   String path = "src/test/resources/testData/testData.xlsx";
        //   String sheetName = "Sayfa1";
        //   ExcelUtil excelUtil =new ExcelUtil(path,sheetName);

        //   List<Map<String, String>> loginData = excelUtil.getDataList();

        loginPage.loginemailElement.sendKeys(loginData.get(0).get("Email"));
        loginPage.loginPasswordBox.sendKeys(loginData.get(0).get("Password"));
    }
    @Then("Click logout button")
    public void clickLogoutButton() {
        loginPage.logoutButton.click();
    }

    @Then("Enter incorrect email address and password with excell")
    public void enterIncorrectEmailAddressAndPasswordWithExcell() {
        loginPage.loginemailElement.sendKeys(loginData.get(1).get("Email")); //bu satirlardaki data invalid
        loginPage.loginPasswordBox.sendKeys(loginData.get(1).get("Password")); //bu satirlardaki data invalid
    }

    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(loginPage.negativeLoginText.isDisplayed());
    }
}
