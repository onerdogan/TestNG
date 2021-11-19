package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test11_DataProviderTek extends TestBase {
    @DataProvider
    public static Object[] aranacakKelimeler() {
        String data[]={"java","javascript","Pyhton"};
        return data;
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test(String aranacakKelimeler){
        driver.get("https://gittigidiyor.com/");
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@name='k']"));
        aramaKutusu.sendKeys(aranacakKelimeler+ Keys.ENTER);


    }
}
