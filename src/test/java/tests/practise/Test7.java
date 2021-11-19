package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test7 extends TestBase{

    @Test
    public void test() throws InterruptedException {


        // 1) "http://automationpractice.com/" ADRESiNE GiDiN

        driver.get("http://automationpractice.com/");
        // 2) 2. URUNUN UZERiNE GELiP Add to chart YAPIN
        Actions actions=new Actions(driver);
        WebElement birinciUrun=driver.findElement(By.xpath("//img[@title='Blouse']"));
        actions.moveToElement(birinciUrun).perform();
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[2]")).click();
        WebElement continueShopping= driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
        Thread.sleep(1000);
        continueShopping.click();
        // 3) 4. URUNUN UZERiNE GELiP Add to chart YAPIN
        WebElement ikinciUrun=driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]"));
        actions.moveToElement(ikinciUrun).perform();
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[4]")).click();
        WebElement continueShopping1= driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
        Thread.sleep(1000);
        continueShopping1.click();
        // 4) 5. URUNUN UZERiNE GELiP Add to chart YAPIN
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement ucuncuUrun=driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[5]"));
        actions.moveToElement(ucuncuUrun).perform();
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[5]")).click();
        WebElement continueShopping2= driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
        Thread.sleep(1000);
        continueShopping2.click();
        // 5) CHART a gelin 3 ürün olduğunu doğrulayın
       String urunsayisi=driver.findElement(By.xpath("//span[@class='ajax_cart_quantity unvisible']")).getText();
       String expectedUrunsayisi="3";
        Assert.assertEquals(urunsayisi,expectedUrunsayisi,"sayi tutmadi");


// 6) CHART'A GELiP Chek out TIKLAYIN





// 7) toplam alışveriş miktarının 108.97 olduğunu doğrula
    }
}