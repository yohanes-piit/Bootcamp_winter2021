package ExpediaPagesObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Expedia_Flights {
	public WebDriver driver;
	@FindBy(xpath="//button[contains(text(),'Check out')]")WebElement chckout;
	public Expedia_Flights (WebDriver driver) {
		this.driver=driver;
	}
	public void clicktochekout() {
		chckout.click();
	}


}
