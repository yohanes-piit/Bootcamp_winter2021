package Bootcamp_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_home {
	 WebDriver driver;
	@FindBy(id="twotabsearchtextbox")WebElement Item;
	@FindBy(id="nav-search-submit-button")WebElement search;
	 public Amazon_home(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	 public void Enteritem() {
		 Item.sendKeys("TV");
	 }
	 public void Searchitem() {
		 search.click();
	 }
	
	

}
