package tests.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class IframeTest02 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/guru99home/");

        List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
        System.out.println("sayfadaki iframe sayisi; "+iframes.size());

        //WebElement iframe1=driver.findElement(By.xpath("//iframe[@width='560']"));
       // driver.switchTo().frame(iframe1);
        driver.switchTo().frame(0);
        WebElement linkYoutube=driver.findElement(By.xpath("//div[@class='ytp-impression-link-text']"));
                linkYoutube.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

      //  WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
       // driver.switchTo().frame(iframe2);
        driver.switchTo().frame(1);
        WebElement linkGuru=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        linkGuru.click();
        Thread.sleep(5000);

        System.out.println(driver.getTitle());
        driver.quit();

    }
}
