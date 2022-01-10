package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nopecommerce {
	public WebDriver driver;
	@FindBy(id="Email") WebElement Email;
	@FindBy(id="Password") WebElement passwd;
	@FindBy(linkText="Log in") WebElement btn;

	
	 Nopecommerce (WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	public void setupuser(String email) {
		Email.clear();
		Email.sendKeys(email);
		
	}
	public void setuppass(String pass) {
		passwd.clear();
		passwd.sendKeys(pass);
		
	}
	public void clicktocontinue() {
		btn.click();
	}

}
