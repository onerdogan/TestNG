package tests.day09;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C04_WindowHandle extends TestBase {

    @Test
    public void test(){

//        ● Tests package’inda yeni bir class olusturun: C04_WindowHandle
//● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
//● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        SoftAssert pamuk=new SoftAssert();
        pamuk.assertEquals((driver.findElement(By.tagName("h3"))),"Opening a new window","yanlismis");
//● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        pamuk.assertTrue((driver.getTitle().contains("The Internet")),"tutmadi");
//● Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();
//● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        pamuk.assertEquals(driver.getTitle(),"New Window","baslik yanlis");
//● Sayfadaki textin “New Window” olduğunu doğrulayın.
//● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        pamuk.assertAll();

    }
}
