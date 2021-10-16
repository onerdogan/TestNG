package tests.day11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {

//    1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
//2. Iki tane metod oluşturun : isExist() ve downloadTest()
//            3. downloadTest () metodunun icinde aşağıdaki testi yapalim:
//            - https://the-internet.herokuapp.com/download adresine gidelim.
//            - logo.png dosyasını indirelim
//4. Ardından isExist()  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim


    @Test
    public void downloadTest() {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("logo.png")).click();

    }

    @Test
    public void isExist() {
        String dosyayolu=System.getProperty("user.home")+"\\Downloads\\logo.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));


    }
}