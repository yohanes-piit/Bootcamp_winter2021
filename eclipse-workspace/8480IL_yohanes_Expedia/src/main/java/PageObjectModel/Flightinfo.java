package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flightinfo {
	WebDriver driver;
	@FindBy(xpath="//button[contains(text(),'Check out')]")WebElement chckout;
	public Flightinfo(WebDriver driver) {
		this.driver=driver;
	}
	public void clicktochekout() {
		chckout.click();
	}

}
