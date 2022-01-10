package AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mmyoh\\eclipse-workspace\\Automation_Maven_project\\drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
WebElement sign=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
sign.click();
Thread.sleep(2000);
WebElement Email=driver.findElement(By.name("email"));
Email.sendKeys("yohanes");
Thread.sleep(2000);
WebElement btn=driver.findElement(By.id("continue"));
btn.click();
Thread.sleep(2000);
driver.close();
	}

}
