package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Homework extends TestBase {
    @Test
    public void test() throws InterruptedException {

        driver.get("https://webdriveruniversity.com/Actions");
        WebElement hoverMe=driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));


        Actions gogo= new Actions(driver);


        gogo.moveToElement(hoverMe).perform();
        WebElement link1=driver.findElement(By.linkText("Link 1"));
        gogo.click(link1).perform();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        WebElement clickHold=driver.findElement(By.xpath("//*[text()='Click and Hold!']"));
        gogo.clickAndHold(clickHold).perform();

        WebElement hold=driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']"));
        System.out.println(hold.getText());


        Thread.sleep(2000);

        WebElement doubleClk=driver.findElement(By.id("double-click"));
        gogo.doubleClick(doubleClk).perform();
        Thread.sleep(2000);
        WebElement dragM=driver.findElement(By.xpath("//*[text()='DRAG ME TO MY TARGET!']"));
        WebElement dropH=driver.findElement(By.id("droppable"));
        gogo.dragAndDrop(dragM,dropH).perform();

        System.out.println(driver.findElement(By.xpath("//*[text()='The Key to Success is to take massive ACTION!']")).getText());

        Assert.assertTrue(driver.getTitle().contains("Actions"),"yok");


    }
}