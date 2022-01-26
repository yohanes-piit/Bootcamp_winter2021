package Fivver_Bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FivverAcc {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String local=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",local+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.fiverr.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		WebElement reg=driver.findElement(By.xpath("//*[@id=\"Header\"]/header/div/div/nav/ul/li[4]/a"));
		reg.click();
		WebElement hold=driver.findElement(By.xpath("//*[@id=\"ZubSGrOJFjUIxyy\"]"));
		hold.click();
		Actions obj= new Actions(driver);
	obj.moveToElement(hold).clickAndHold().perform(); 
		  Thread.sleep(6000);
		

		
		WebElement reg2=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/section/header/div/a"));
		reg.click();
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Email.sendKeys("mmyohanes@yahoo.com");
	
		WebElement continiue=driver.findElement(By.xpath("/html/body/div[15]/div/section/div/form/div/button"));
		continiue.click();
	
		WebElement user=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		user.sendKeys("Iuser");
		//*[@id="password"]
		WebElement passwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwd.sendKeys("Mypassword1");
		
		WebElement join=driver.findElement(By.xpath("/html/body/div[15]/div/section/div/form/button"));
		join.click();
		
	}
	

}
