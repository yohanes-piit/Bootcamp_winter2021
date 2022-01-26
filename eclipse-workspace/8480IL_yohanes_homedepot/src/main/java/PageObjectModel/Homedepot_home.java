package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homedepot_home {
	WebDriver driver;
	@FindBy(linkText="My Account") WebElement Acc;
	@FindBy(xpath="/html/body/div[15]/div[2]/div/div/div/div/p[3]/a/span") WebElement reg;
	
	public Homedepot_home(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void ClickonACC() {
		 Acc.click();
	}
	public void clickonREG() {
		reg.click();
	}

}
