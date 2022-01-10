package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement sign;
	AmazonHomepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void clickTosignin() {
	sign.click();
}
}
