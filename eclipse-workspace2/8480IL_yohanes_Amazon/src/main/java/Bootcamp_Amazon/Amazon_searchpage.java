package Bootcamp_Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searchpage {
	WebDriver driver;
@FindBy(xpath="//*[contains(text(),'Introducing Amazon Fire TV 43')]") List <WebElement> list;
@FindBy(xpath="//input[@id='add-to-cart-button']")WebElement cart;
@FindBy(xpath="//body/div[8]/div[1]/div[1]/div[1]/div[1]/div[7]/span[3]/span[1]/input[1]")WebElement warranty;
@FindBy(xpath="//a[@id='nav-cart']")WebElement fromcart;
@FindBy(xpath="//body/div[@id='a-page']/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/span[1]/span[1]/input[1]")WebElement prochekout;

public  Amazon_searchpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void ClickonItem(String item) throws InterruptedException {
	System.out.println(list.size());
	Thread.sleep(6000);
	List<WebElement> Item=list;
	for(int i=0;i<Item.size();i++) {
	if(Item.get(i).getText().contains("Introducing Amazon Fire TV 43")) {
		Thread.sleep(6000);
	list.get(i).click();
	break;
	}
	}
}
public void Addtocart() throws InterruptedException {
	cart.click();
	Thread.sleep(6000);
}
public void Buywarranty() throws InterruptedException {
	warranty.click();
	Thread.sleep(6000);

}
public void FromCart() throws InterruptedException {
	fromcart.click();
	Thread.sleep(6000);
	
}
public void proceedTochekout() throws InterruptedException {
	prochekout.click();
	Thread.sleep(6000);
}


}
