package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAccPage {
	WebDriver driver;
	@FindBy(id="email") WebElement Email;
	@FindBy(id="password-input-field") WebElement Passwd;
	@FindBy(name="zipcode") WebElement Zipco;
	@FindBy(name="phone") WebElement Phon;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[1]/div/div/span/div[4]") WebElement notrobo;
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/form/button/span") WebElement Continue;
	public CreatAccPage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void Entermail(String email) {
		 Email.sendKeys(email);
		 
	 }
	 public void Enterpasswd(String passcode) {
		 Passwd.sendKeys(passcode);
	 }
	 public void EnterZip(String zipcode) {
		 Zipco.sendKeys(zipcode);
	 }
	 public void Enterphone(String phone) {
		 Phon.sendKeys(phone);
	 }
	 public void clickbox() {
		 notrobo.click();
		 
	 }
	 public void clickTocontinue(){
		 Continue.click();
	 }
}
