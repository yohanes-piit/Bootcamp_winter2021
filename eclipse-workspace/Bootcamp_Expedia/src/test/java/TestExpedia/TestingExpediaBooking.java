package TestExpedia;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Common.utility;
import ExpediaPagesObjectmodel.Expedia_home;

public class TestingExpediaBooking extends  utility {
	
	 @Test
	  public void f() throws InterruptedException {
		  Expedia_home obj= new Expedia_home(driver);
		  Thread.sleep(6000);
		  obj.clickonFlights();
		  Thread.sleep(6000);
		 obj.Triptype();
		  Thread.sleep(6000);
		  obj.Setdeparturecity();
		  Thread.sleep(6000);
		 obj.SearchCity();
		 Thread.sleep(6000);
		  obj.setarrivalcity();
		  Thread.sleep(6000);
		  obj.setdepartingday() ;
		  Thread.sleep(6000);
		  obj.setarrivinbday();
		  Thread.sleep(6000);
		  obj.clicktosearch();
		  Thread.sleep(6000);
		  
		  
	  }
	  
	  
}
