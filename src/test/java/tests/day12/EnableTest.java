package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class EnableTest extends TestBase {

    @Test
    public void isEnabled() {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        SoftAssert soft=new SoftAssert();
        soft.assertFalse((driver.findElement(By.xpath("//input[@type='text']")).isEnabled()),"ulasilabiliyor");

        WebElement enable=driver.findElement(By.xpath("//button[text()='Enable']"));
        enable.click();
        WebDriverWait stop=new WebDriverWait(driver,20);
        WebElement appearTexbox=stop.until(ExpectedConditions. elementToBeClickable ((driver.findElement(By.xpath("//input[@type='text']")))));
        soft.assertTrue(driver.findElement(By.xpath("//p[@id='message']")).isDisplayed(),"mesaj gorunmedi");
        soft.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled(),"textbox etkin degil");
        soft.assertAll();



    }

}