package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {
    /**
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     * Choose price low to high
     * // * Verify item prices are sorted from low to high
     */

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user"+ Keys.TAB+"secret_sauce"+Keys.ENTER);
        WebElement dropDownPrice=driver.findElement(By.className("product_sort_container"));
        Select choose=new Select(dropDownPrice);
        Thread.sleep(1000);
        choose.selectByValue("lohi");

        List<WebElement> price=driver.findElements(By.className("inventory_item_price"));


        List<String> pricesString=new ArrayList<>();
        List<Double> pricesStringd=new ArrayList<>();
        for(WebElement each:price){
            pricesString.add(each.getText().replace('$',' '));
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
    public void tearDown() {
        driver.close();
    }
}