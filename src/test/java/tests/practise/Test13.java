package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class Test13 extends TestBase {
    //https://the-internet.herokuapp.com/add_remove_elements/
    //click on the Add element button 100 times
    //write a function that takes a number, and click the delete button
    //given number of times, and validates that given number of buttons was deleted

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(40);
        deleteButtonAndValidate(30);

    }

    private  void createButtons(int numberofButtonToAdd){
        WebElement button=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i <numberofButtonToAdd ; i++) {
            button.click();

        }
    }
    private void deleteButtonAndValidate (int number) {
        List<WebElement> deleteElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int sizeFirst = deleteElements.size();
        List<WebElement> deleted = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int count = 0;
        for (WebElement each : deleted) {
            count++;
            if (count > number) {
                break;
            }
            each.click();
        }
        List<WebElement> elementsAfter = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int sizeElementafter = elementsAfter.size();
        if ((sizeFirst - number) == sizeElementafter){
            System.out.println("PASS");
    }else
            System.out.println("FAIL");

    }
}
