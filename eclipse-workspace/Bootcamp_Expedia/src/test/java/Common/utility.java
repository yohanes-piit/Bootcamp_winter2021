package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class utility {
	public WebDriver driver;
		  @Parameters ({"browser","website"})
		 	@BeforeMethod
		 	 public void Browsers(String browser,String website) throws InterruptedException {
		 		  if(browser.equalsIgnoreCase("chrome")) {
		 			  String local= System.getProperty("user.dir");
		 				 System.out.println(local);
		 				 System.setProperty("webdriver.chrome.driver",local+"\\BrowserDriver\\chromedriver.exe");
		 				 
		 				 
		 				  driver=new ChromeDriver();
		 				  driver.navigate().to(website);
		 				  Thread.sleep(2000);
		 				  driver.manage().window().maximize();
		 				  Thread.sleep(2000);
		 			  
		 		  }else if(browser.equalsIgnoreCase("edge")) {
		 			  String local= System.getProperty("user.dir");
		 				 System.out.println(local);
		 				 System.setProperty("webdriver.edge.driver",local+"\\BrowserDriver\\msedgedriver.exe");
		 				 
		 				  driver=new EdgeDriver();
		 				  driver.navigate().to(website);
		 				  Thread.sleep(2000);
		 				  driver.manage().window().maximize();
		 				  Thread.sleep(2000);
		 	  }else if(browser.equalsIgnoreCase("firefox")) {
		 		  String local= System.getProperty("user.dir");
		 			 System.out.println(local);
		 			 System.setProperty("webdriver.gecko.driver",local+"\\BrowserDriver\\geckodriver.exe");
		 			  driver=new FirefoxDriver();
		 			  driver.get("wbsite");
		 			  Thread.sleep(2000);
		 			  driver.manage().window().maximize();
		 			  Thread.sleep(2000);
		 		  
		 	  }else {
		 		  System.out.println("Brother! cheek your browser name");
		 	  }
		 	  
		 	  
		 }

		   
		  
		 }

	  
  

  
 