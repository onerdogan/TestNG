package tests.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class OdevEmoji extends TestBase {

    //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    //maximize the web site
    //click on second emoji
    //click all second emoji's element

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.manage().window().maximize();

        driver.switchTo().frame("emoojis");
        WebElement secondEmoji=driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
        secondEmoji.click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f400.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f401.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f402.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f403.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f404.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f405.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f406.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f407.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f408.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f408.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f410.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f411.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f412.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f413.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f414.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f415.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f416.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f417.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f418.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f419.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f420.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f421.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f422.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f423.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f424.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f425.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f426.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f427.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f428.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f429.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f430.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f431.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f432.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f433.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f434.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f435.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f436.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f437.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f438.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f439.png']")).click();
     driver.findElement(By.xpath("//img[@src='https://twemoji.maxcdn.com/v/13.1.0/72x72/1f43a.png']")).click();
        //go back parent iframe

    driver.switchTo().parentFrame();
        //fill out the form,(Fill the form with the texts you want)
        driver.findElement(By.xpath("//input[@class='mdl-textfield__input']")).sendKeys("input1"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='smiles']")).sendKeys("input2"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='nature']")).sendKeys("input3"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='food']")).sendKeys("input4"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='activities']")).sendKeys("activities"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='places']")).sendKeys("places"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='objects']")).sendKeys("objects"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='symbols']")).sendKeys("symbols"+ Keys.TAB);
        driver.findElement(By.xpath("//input[@id='flags']")).sendKeys("flags"+ Keys.TAB);

        //click on apply button
        driver.findElement(By.xpath("//button[@id='send']")).click();
        Thread.sleep(3000);
        driver.close();



    }
}