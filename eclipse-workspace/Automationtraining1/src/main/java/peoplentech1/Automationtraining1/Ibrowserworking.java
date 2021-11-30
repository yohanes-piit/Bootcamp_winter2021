package peoplentech1.Automationtraining1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmyoh\\eclipse-workspace\\Automationtraining1\\src\\drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.amazon.com");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
String windowhandle = driver.getWindowHandle();
System.out.println(windowhandle);
Thread.sleep(2000);
String url=driver.getCurrentUrl();
System.out.println(url);
driver.close();


	}

}
