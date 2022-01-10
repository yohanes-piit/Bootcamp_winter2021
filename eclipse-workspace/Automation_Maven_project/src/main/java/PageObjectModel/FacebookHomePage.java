package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
	WebDriver driver;
	
	
@FindBy(id="email") WebElement username;
@FindBy(id="pass") WebElement password;
@FindBy(name="login") WebElement login;

FacebookHomePage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void Enterusername(String userid) {
	username.sendKeys(userid);
	
}
public void Enterpassword(String userpass) {
	password.sendKeys(userpass);
	
}
public void clicktocontinue() {
	
	login.click();
}

}
