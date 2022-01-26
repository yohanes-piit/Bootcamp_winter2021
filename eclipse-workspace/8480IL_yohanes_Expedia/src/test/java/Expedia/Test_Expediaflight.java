package Expedia;

import org.testng.annotations.Test;

import Expedia_Common.Utility;
import PageObjectModel.Home_Expidea;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Test_Expediaflight extends Utility{
	

  @Test
  public void f() throws InterruptedException {
	  Home_Expidea Exp= new Home_Expidea(driver);
	  Thread.sleep(2000);
	  Exp.clickonFlights();
	  Thread.sleep(2000);
	  Exp.TripType();
	  Exp.Setdeparturecity();
	 Thread.sleep(2000);
	 // Exp.Searchcity();
	 // Thread.sleep(2000);
	Exp.setarrivalcity();
	 Thread.sleep(2000);
	  Exp.setdepartingday() ;
	  Thread.sleep(2000);
	  Exp.setarrivinbday();
	  Thread.sleep(2000);
	  Exp.confirmDay();
	  Exp.clicktosearch();
	  Thread.sleep(2000);
	  
	  
  }
  
  
 
	 

 

}