package tests.practise;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test4 extends TestBase {

    // 1) https://www.ntv.com.tr/ ADRESİNE GİT
    // 2) SAYFANIN TiTLE'NIN "NTV HABER - Haberler, Son Dakika Haberleri" OLDUGUNU DOGRULA
    // 3) SAYFANIN HANDLE DEGERiNi AL.
    // 4) SPOR SAYFASINA TIKLA
    // 5) URL'iN "https://www.ntvspor.net/" OLDUGUNU DOGRULA
    // 6) ANA SAYFAYA GERi DON



    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.ntv.com.tr/");
        System.out.println("title"+driver.getTitle());

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("NTV HABER - Haberler, Son Dakika Haberleri"),"title tutmadi");



        String firstWindowHandle=driver.getWindowHandle();
        System.out.println("ilk sayfa handle: "+firstWindowHandle);
        driver.findElement(By.linkText("SPOR")).click();
        System.out.println(driver.getCurrentUrl());
        Set<String> allWindowsHandles=driver.getWindowHandles();
        System.out.println("Handles"+allWindowsHandles);
        String secondWindowHandle="";
        for (String each:allWindowsHandles){
            if(firstWindowHandle!=each)
                secondWindowHandle=each;
        }
        System.out.println("ikinci sayfa   "+secondWindowHandle);


        driver.switchTo().window(secondWindowHandle);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        softAssert.assertEquals(driver.getCurrentUrl(),"https://www.ntvspor.net/","ayni degil");
        softAssert.assertAll();
        driver.switchTo().window(firstWindowHandle);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}