package tests.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;

// Her Allert JS Allert degildir
// Allert ciktiginda sag click yapip incele diyebiliyorsak bu bir HTML alert'dir
// HTML alert'ler siradan webelement'ler olarak locate edilip kullanilabilir
// Sag click yapamiyorsak alert bir JS Allert'dur ve switchTo() kullanilarak handle edilebilir
public class C01_Allerts {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void acceptAlert(){
        //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //      “You successfully clicked an alert” oldugunu test edin.

//            driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//            driver.switchTo().alert().accept();
//            WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
//            assertEquals((result.getText()),"You successfully clicked an alert","resultlar tutmadi");


        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        WebElement resultYaziElementi=driver.findElement(By.id("result"));
        String expectedResult="You successfully clicked an alert";
        String actualResult= resultYaziElementi.getText();
        assertEquals(actualResult,expectedResult,"sonuc yazisi istenen ile ayni degil");
    }
    @Test
    public void dismissAlert(){
        //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //      “successfuly” icermedigini test edin.

//        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
//        driver.switchTo().alert().dismiss();
//        WebElement result2=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']"));
//        assertFalse((result2.getText()).contains("successfuly"),"expected yazi iceriyor");


        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String istenmeyenKelime="successfuly";
        WebElement resultYaziElementi=driver.findElement(By.id("result"));
        String actualResult=resultYaziElementi.getText();
        assertFalse(actualResult.contains(istenmeyenKelime),"result yazisi istenmeyen kelimeyi iceriyor");
    }
    @Test
    public void sendKeysAlert(){
        //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        //      OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

//
//        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
//        String isim="oner";
//        driver.switchTo().alert().sendKeys(isim);
//        driver.switchTo().alert().accept();
//        WebElement result3=driver.findElement(By.xpath("//p[@id='result']"));
//        SoftAssert lightAssert=new SoftAssert();
//        lightAssert.assertTrue(result3.getText().contains(isim),"isim yok");
//        lightAssert.assertAll();


        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        String isim="Mehmet";
        driver.switchTo().alert().sendKeys(isim);
        driver.switchTo().alert().accept();
        WebElement resultYaziElementi=driver.findElement(By.id("result"));
        String actualResult=resultYaziElementi.getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualResult.contains(isim));
        softAssert.assertAll();
    }
    @AfterClass
    public void tearDown(){
    driver.close();
    }
}