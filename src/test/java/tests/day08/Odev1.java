package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Odev1 {
    /**
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     * Choose price low to high
     // * Verify item prices are sorted from low to high
     */

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement dropDownSort=driver.findElement(By.className("product_sort_container"));
        Thread.sleep(1000);
        Select choose=new Select(dropDownSort);
        choose.selectByVisibleText("Price (low to high)");

        // * Verify item prices are sorted from low to high

        List<WebElement> prices=driver.findElements(By.className("inventory_item_price"));
        List<String> pricesString=new ArrayList<>();
        List<Double> pricesStringd=new ArrayList<>();
        for(WebElement each:prices){
          pricesString.add(each.getText().replace("$", ""));
        }

        System.out.println(pricesString);

        for (int i = 0; i < pricesString.size(); i++) {

            double doublella = Double.parseDouble( pricesString.get(i));

           pricesStringd.add(doublella);

        }   System.out.println(pricesStringd);



        List<Double> newPriceList= new ArrayList<>();
       newPriceList.addAll(pricesStringd);


       Collections.sort(newPriceList);
       System.out.println(newPriceList);

        SoftAssert light=new SoftAssert();
        light.assertEquals(pricesStringd,newPriceList,"liste birbirini tutmadi");

         light.assertAll();

    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}