package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class C04_SoftAssert {

//    1.“https://www.hepsiburada.com/” Adresine gidin
//            2.Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdigini dogrulayin
//            3.search kutusuna araba yazip arattirin
//4.bulunan sonuc sayisini yazdirin
//5.sonuc yazisinin "araba" icerdigini dogrulayin
//6.Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void test() {

        driver.get("https://www.hepsiburada.com/");
        SoftAssert softAssert=new SoftAssert();
        System.out.println(driver.getTitle());
        softAssert.assertTrue(driver.getTitle().contains("Türkiye'nin En Büyük Online Alışveriş Sitesi"),"baslik farkli");
        driver.findElement(By.className("desktopOldAutosuggestTheme-input")).sendKeys("araba"+ Keys.ENTER);
        WebElement sonuclar=driver.findElement(By.xpath("//div[@class='category-suggestion-title']"));
        System.out.println(sonuclar.getText());

        softAssert.assertTrue(sonuclar.getText().contains("araba"),"sonuclar araba yok");
        softAssert.assertFalse(sonuclar.getText().contains("oto"),"oto yazisi var");
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
       driver.close();
    }
}