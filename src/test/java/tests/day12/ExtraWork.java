package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class ExtraWork extends TestBase {
    @Test
    public void handleTest() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(frame1);
        WebElement ourProducts=driver.findElement(By.linkText("Our Products"));
        ourProducts.click();
        WebElement cameras=driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]"));
        cameras.click();
        Thread.sleep(5000);
        WebElement popUp=driver.findElement(By.xpath("//h4[@class='modal-title']"));
        System.out.println(popUp.getText());
        WebElement closeButton=driver.findElement(By.xpath("//*[text()='Close']"));
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("WebdriverUniversity.com (IFrame)")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://webdriveruniversity.com/index.html");
    }
}