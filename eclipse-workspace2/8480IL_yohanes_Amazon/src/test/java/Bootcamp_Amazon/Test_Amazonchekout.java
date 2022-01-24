package Bootcamp_Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Test_Amazonchekout extends Amazon_common_class{
  @Test (dataProvider="Dp")
  public void f(String item) throws InterruptedException, IOException {
	Amazon_home AMZ= new Amazon_home(driver)  ;
	Thread.sleep(2000);
	AMZ.Enteritem();
	Thread.sleep(2000);
	AMZ.Searchitem();
	Thread.sleep(2000);
	shots();
	Thread.sleep(2000);
	Amazon_searchpage AMZ2= new Amazon_searchpage(driver);
	Thread.sleep(2000);
	AMZ2.ClickonItem("item");
	Thread.sleep(2000);
	shots();
	Thread.sleep(2000);
	AMZ2.Addtocart();
	Thread.sleep(2000);
	shots();
	Thread.sleep(2000);
	AMZ2.Buywarranty();
	Thread.sleep(2000);
	AMZ2.FromCart();
	Thread.sleep(2000);
	AMZ2.proceedTochekout();
	Thread.sleep(2000);
	shots();
	  
	  
  }
@DataProvider
public String [][] Dp(){
	String AMZsearch[][]= {
							{"TV"}
	};
	return AMZsearch;
}



 

}
