package Common;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class utility {
	public WebDriver driver;
  @Parameters({"browser","wbsite"})
  @BeforeMethod
public void Browsers(String browser, String wbsite) throws InterruptedException {
	  
	  String local=System.getProperty("user.dir");
	  if(browser.equalsIgnoreCase("edge")) {
	  System.setProperty("webdriver.edge.driver", local+"\\drivers\\msedgedriver.exe");
		driver= new EdgeDriver();
		Thread.sleep(2000);
		driver.navigate().to(wbsite);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  }else if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", local+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(2000);
			driver.navigate().to(wbsite);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		  
	  }else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", local+"\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			Thread.sleep(2000);
			driver.navigate().to(wbsite);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
	  }else {
		  System.out.println("set browser name");
	  }
  }
  public void shots() throws IOException {
	  String local=System.getProperty("user.dir");
	  System.out.println(local);
	  Date dt= new Date();
	  System.out.println(dt);
	  String td= dt.toString().replace(" ", "_").replace(":", "_");
	File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(stored,new File(local + "\\pictures\\"+td+"shots.jpg"));
	
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
}
