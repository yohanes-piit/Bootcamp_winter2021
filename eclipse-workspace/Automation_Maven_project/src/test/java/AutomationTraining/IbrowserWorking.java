package AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IbrowserWorking {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mmyoh\\eclipse-workspace\\Automation_Maven_project\\drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String window= driver.getWindowHandle();
		System.out.println(window);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		driver.close();

	}

}
