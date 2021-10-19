package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class HandleWork extends TestBase {
    /*
      go to url :http://demo.guru99.com/popup.php
      get the first window
      clicking on click here button
      get all the window in the set
      switch to window
      input email id (someone@gmail.com) and type something in that input
      Clicking on the submit button
      verify title as expected
      switch to first window
     */
    @Test
    public void handleTest(){
        driver.get("http://demo.guru99.com/popup.php");
        System.out.println("current handle; "+driver.getWindowHandle());
        String firstHandle=driver.getWindowHandle();//geri donebilmek icin first handle stringe atadik
        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
        clickHere.click();


        driver.switchTo().window(getSecondHandle());//TestBase deki getSecondHandle()methodunu Window metodunda cagirdik

        System.out.println("current handle; "+driver.getWindowHandle());
        WebElement inputEmail=driver.findElement(By.xpath("//input[@name='emailid']"));
        inputEmail.sendKeys("someone@gmail.com"+ Keys.TAB+Keys.ENTER);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(driver.getTitle(),"Guru99 Bank Home Page","title tutmadi");
        soft.assertAll();
        driver.switchTo().window(firstHandle);

    }
}

