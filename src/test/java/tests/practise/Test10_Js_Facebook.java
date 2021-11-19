package tests.practise;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test10_Js_Facebook extends TestBase {
    @Test
    public void setUp() throws InterruptedException {
        driver.get("http://facebook.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById('email').value='deneme@abc.com';");
        js.executeScript("document.getElementById('pass').value='123456';");
        //value--locate edilen yere deger gonderir
        Thread.sleep(3000);
    }

}
