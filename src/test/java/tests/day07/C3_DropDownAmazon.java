package tests.day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

// Bir class oluşturun: C3_DropDownAmazon
public class C3_DropDownAmazon {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // ● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void test1() throws InterruptedException {
//        Arama kutusunun yanindaki kategori menusundeki kategori
//        sayisinin 45 oldugunu test edin
        WebElement dropDownSearch = driver.findElement(By.id("searchDropdownBox"));
        Select departments = new Select(dropDownSearch);

        List<WebElement> opsiyonList = departments.getOptions();
        System.out.println(opsiyonList.size());


     //  Assert.assertEquals(opsiyonList.size(), 45, "expected fazla cikti");
    }
//        -Test 2
        @Test(dependsOnMethods = "test1")
        public void test2() throws InterruptedException {
//        1. Kategori menusunden Books secenegini secin
            WebElement dropDownSearch = driver.findElement(By.id("searchDropdownBox"));
            Select departments = new Select(dropDownSearch);
            departments.selectByVisibleText("Books");
            Thread.sleep(2000);
//        2. Arama kutusuna Java yazin ve aratin
            WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("java" + Keys.ENTER);

//        3. Bulunan sonuc sayisini yazdirin
            WebElement result=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
            System.out.println(result.getText());

//        4. Sonucun Java kelimesini icerdigini test edin
            Assert.assertTrue(result.getText().contains("java"));
            if(result.getText().contains("Java")){
                System.out.println("result expected iceriyor: PASS");
            }else {
                System.out.println("result expected icermiyor: FAILED");
            }
    }

    @AfterMethod
    public void tearDown(){
        driver.close();

    }
}
