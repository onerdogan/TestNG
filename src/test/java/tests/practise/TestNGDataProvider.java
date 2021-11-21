package tests.practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestNGDataProvider{ //extends TestBase {

   @Test(dataProvider = "getData")
    public void test(String username, String password){
       System.out.println(username+" "+password);
     //  driver.get("http://opencart.abstracta.us/index.php?route=account/login");
       //asd@gmail.com          123qweasd

   }
   @DataProvider
   public Object[][] getData(){
       Object[][] data ={
               {"asd@gmail.com","123qweasd"},
               {"qqqq","34444"},
               {"sssss","5555"}

       };
       return data;
   }
@Test(dataProvider = "getData2")
    public void usernameTest(String username){
    System.out.println("username="+username);
}

@DataProvider
    public Iterator<Object> getData2 (){
    List<Object> data =new ArrayList<>();
    data.add("merve");
    data.add("esra");
    data.add("hakan");
    return  data.iterator();
}

}
