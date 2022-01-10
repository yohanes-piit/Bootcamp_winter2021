package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninPage {
	WebDriver driver;
	@FindBy(id="ap_email") WebElement userid;
	@FindBy(id="continue") WebElement btn;
	@FindBy(xpath="//*[contains(text(),'We cannot find an account with that')]") WebElement Eror;
	AmazonSigninPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setuserid() {
		userid.sendKeys("yohanes");
		
	}
	public void clickTocontinue() {
		btn.click();
	}
	public String Errormessage() {
		String msg=Eror.getText();
		return msg;
		
	}

	private void getText() {
		// TODO Auto-generated method stub
		
	}

}
