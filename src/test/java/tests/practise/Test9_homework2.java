package tests.practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test9_homework2 extends TestBase {

    @Test
    public void setUp() throws InterruptedException {
    driver.get("https://books-pwakit.appspot.com/");
        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        WebElement aramakutusu=(WebElement) jsExecutor.executeScript(
                "return document.querySelector(\"body > book-app\")." +
                        "shadowRoot.querySelector(\"#input\")");
        aramakutusu.sendKeys("En guzel kitap");
        Thread.sleep(3000);


    }
}
