package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {

    public static void jsScroll() {

        JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownWithJS() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);

    }

    public static void clickWithJS(WebElement webElement) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Thread.sleep(3000);

        js.executeScript("arguments[0].click();", webElement);

    }

    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }

    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollUpWithJS() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(3000);

    }
}
