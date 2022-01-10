package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.utility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Test_AmazonSignin2 extends utility{
  
	
	
	@Test(priority=2, dependsOnMethods="Testing_signin")
  
  public void f() throws InterruptedException {
		
		AmazonHomepage Home= new AmazonHomepage (driver);
		Home.clickTosignin();
		Thread.sleep(2000);
		AmazonSigninPage Sign=new AmazonSigninPage(driver);
		 Sign.setuserid();
		 Thread.sleep(2000);
		 Sign.clickTocontinue();
		 Thread.sleep(2000);
		
  }

	@Test(priority=1)
  
  public void Testing_signin() throws InterruptedException, IOException {
		
		AmazonHomepage Home= new AmazonHomepage (driver);
		Home.clickTosignin();
		 shots();
		Thread.sleep(2000);
		AmazonSigninPage Sign=new AmazonSigninPage(driver);
		 Sign.setuserid();
		 shots();
		 Thread.sleep(2000);
		 Sign.clickTocontinue();
		 Thread.sleep(2000);
		 shots();
		 String erormsg=Sign.Errormessage(); 
		 System.out.println(erormsg);
		 Thread.sleep(2000);
		 SoftAssert soft= new SoftAssert();
		 soft.assertEquals(erormsg, "We cannot find an account with that email address");
		 soft.assertAll();
	
	}
	
  
  



 
  
  
  

}
