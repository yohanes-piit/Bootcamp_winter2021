package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseAccountType {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[4]/button/span") WebElement personal;
	public ChooseAccountType(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	public void selectpersonalAcc() {
		personal.click();
		
	}
	
}
