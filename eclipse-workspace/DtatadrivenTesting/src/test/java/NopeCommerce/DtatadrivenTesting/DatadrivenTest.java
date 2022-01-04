package NopeCommerce.DtatadrivenTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class DatadrivenTest {
	public WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmyoh\\eclipse-workspace\\DtatadrivenTesting\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	
	
  @Test(dataProvider ="logindata")
  public void f(String admin,String password,String exp) throws InterruptedException {
	  driver.get("https://admin-demo.nopcommerce.com/");
	
	 WebElement  email=driver.findElement(By.id("Email"));
	  email.clear();
	  email.sendKeys(admin); 
	  
	   WebElement pass= driver.findElement(By.id("Password"));
	   pass.clear();
	   pass.sendKeys(password);
	   
	   WebElement btn=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	  btn.click();
	  
	  String exp_title="Dashboard";
	  String act_title=driver.getTitle();
	  Thread.sleep(2000);
	  
	  
	  if(exp.equals("valid"))
	  {
		  if(exp_title.equals("act_title")) 
		  {
			 driver.findElement(By.linkText("logout")).click();
			  Assert.assertTrue(true);
		  }
		  else 
		  {
			  Assert.assertTrue(false);  
		  }
	  }
	  else if(exp.equals("invalid")) 
	  {
		  if(exp_title.equals("act_title")) 
		  {
			  Assert.assertTrue(false); 
		  }else 
		  {
			  Assert.assertTrue(true); 
		  }
	 
	 }
  }	  

  

  @DataProvider(name="logindata")
  public String [][] getdata() {
	  String logindata [][]= {
			   {"admin@yourstore.com","admin","valid"},
				{"admin@yourstore.com","adn","invalid"},
				{"adn@yourstore.com","admin","invalid"},
				{"adn@yourstore.com","adn","invalid"}
	  };
	  return logindata;
	  
  }
 


  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}

