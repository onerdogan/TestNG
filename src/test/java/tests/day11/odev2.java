package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class odev2 extends TestBase {


    @Test
    public void test() throws InterruptedException {
        //  go to url :http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //    click  "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//a[@class='analystic']")).click();

//    accept Alert(I am an alert box!) and print alert on console
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        System.out.println(driver.switchTo().alert().getText());

//    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        driver.switchTo().alert().accept();

//    cancel Alert  (Press a Button !)
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
//    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Thread.sleep(2000);
        // driver.switchTo().alert().accept();
        driver.switchTo().alert().sendKeys("TechProEducation");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        WebElement message = driver.findElement(By.id("demo1"));
        System.out.println(message.getText());
    }
}