package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class odev1 extends TestBase {


    @Test
    public void test() throws InterruptedException {
        //    Go to http://demo.guru99.com/test/drag_drop.html url
        driver.get("http://demo.guru99.com/test/drag_drop.html");

//    Drag and drop the BANK button to the Account section in DEBIT SIDE
       WebElement drag= driver.findElement(By.linkText("BANK"));
       WebElement drop=driver.findElement(By.xpath("(//div[@class='shoppingCart'])[1]"));
        Actions action=new Actions(driver);
        action.dragAndDrop(drag,drop).perform();
//    Drag and drop the SALES button to the Account section in CREDIT SIDE
        WebElement drag2= driver.findElement(By.linkText("SALES"));
        WebElement drop2=driver.findElement(By.xpath("(//div[@class='shoppingCart'])[3]"));
        action.dragAndDrop(drag2,drop2).perform();
//    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        WebElement drag3= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement drop3=driver.findElement(By.xpath("(//div[@class='shoppingCart'])[2]"));
        action.dragAndDrop(drag3,drop3).perform();
//    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        WebElement drag4= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement drop4=driver.findElement(By.xpath("(//div[@class='shoppingCart'])[4]"));
        action.dragAndDrop(drag4,drop4).perform();
    }
}