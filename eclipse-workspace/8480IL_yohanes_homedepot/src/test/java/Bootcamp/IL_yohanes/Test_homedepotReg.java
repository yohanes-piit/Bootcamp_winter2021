package Bootcamp.IL_yohanes;

import org.testng.annotations.Test;

import PageObjectModel.ChooseAccountType;
import PageObjectModel.CreatAccPage;
import PageObjectModel.Homedepot_home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Test_homedepotReg extends Base{
	
  @Test(dataProvider="regDataprovider")
  public void TestReg(String email,String passcode,String zipcode,String phone) throws InterruptedException {
	  Homedepot_home obj1=new Homedepot_home(driver);
	  obj1.ClickonACC();
	  Thread.sleep(5000);
	  obj1.clickonREG();
	  Thread.sleep(5000);
	  ChooseAccountType obj2= new ChooseAccountType(driver);
	  Thread.sleep(5000);
	  obj2.selectpersonalAcc();
	  Thread.sleep(5000);
	  CreatAccPage obj3= new CreatAccPage(driver);
	  Thread.sleep(5000);
	  obj3.Entermail(email);
	  Thread.sleep(5000);
	  obj3.Enterpasswd(passcode);
	  Thread.sleep(5000);
	  obj3.EnterZip(zipcode);
	  Thread.sleep(5000);
	  obj3.Enterphone(phone);
	  Thread.sleep(6000);
	 
  }
  
 @DataProvider
 public String[][] regDataprovider(){
	 String accregister[][] = {
			 {"yohanes@.com","Password@1","11111","1111111111"},
			 {"beth@yahoo.com","pasword@2","22222","2222222222"}
			
	 };
	 return accregister;
 }
  
  
}
