package peopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iborowserworking {

	static WebDriver driver;
	public static void main(String[] args, By by, String email) throws InterruptedException {
		//how to open the browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmyoh\\eclipse-workspace\\Automationtraining\\src\\drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.findElement(by.id(email));
		
		
		
		
		
	}

}
