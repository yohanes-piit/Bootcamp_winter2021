package Bootcamp.IL_yohanes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
	WebDriver driver;
  @Parameters({"browser","wbsite"})
  @BeforeMethod
	  public void Browsers(String browser,String website) throws InterruptedException {
		  if(browser.equalsIgnoreCase("chrome")) {
			  String local= System.getProperty("user.dir");
				 System.out.println(local);
				 System.setProperty("webdriver.chrome.driver",local+"\\drivers\\chromedriver.exe");
				  driver=new ChromeDriver();
				  driver.navigate().to(website);
				  Thread.sleep(2000);
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
			  
		  }else if(browser.equalsIgnoreCase("edge")) {
			  String local= System.getProperty("user.dir");
				 System.out.println(local);
				 System.setProperty("webdriver.edge.driver",local+"\\drivers\\msedgedriver.exe");
				  driver=new EdgeDriver();
				  driver.navigate().to(website);
				  Thread.sleep(2000);
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
	  }else if(browser.equalsIgnoreCase("edge")) {
		  String local= System.getProperty("user.dir");
			 System.out.println(local);
			 System.setProperty("webdriver.gecko.driver",local+"\\drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get("wbsite");
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
		  
	  }else {
		  System.out.println("Brother! cheek your browser name");
	  }
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
