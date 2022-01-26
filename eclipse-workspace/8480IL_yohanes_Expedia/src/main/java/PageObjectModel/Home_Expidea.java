package PageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Expidea {
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[4]/div[1]/div/div/div/div/div/ul/li[2]/a/span") WebElement flight;
	@FindBy(xpath="//*[contains(text(),'Roundtrip')]")WebElement roundtrip;
	@FindBy(id="location-field-leg1-origin") WebElement departure;
	@FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]")WebElement arrival;
	@FindBy(id="d1-btn")WebElement departingday;
	@FindBy(id="d2-btn")WebElement arrivingday;
	@FindBy(xpath="//*[@id=\"app-layer-datepicker-flights-departure-arrival-start\"]/div[2]/div/div/div[3]/button") WebElement Done;
	@FindBy(xpath="//button[contains(text(),'Search')]")WebElement search;
	
	public Home_Expidea(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void clickonFlights() throws InterruptedException {
		flight.click();
		Thread.sleep(6000);
	}
	public void TripType() throws InterruptedException {
		roundtrip.click();
		Thread.sleep(6000);
	}
	
	
	public void Setdeparturecity() throws InterruptedException {
		departure.sendKeys(Keys.DOWN);
		departure.sendKeys("chicago");
		Thread.sleep(6000);
		
	}
	
	public void setarrivalcity() throws InterruptedException {
		departure.sendKeys("washington");
		Thread.sleep(6000);
		
	}
	public void setdepartingday() {
		departingday.sendKeys(" Fri feb 25");;
	}
	public void setarrivinbday() {
		arrivingday.sendKeys("Wed Mar 25");
	}
	public void confirmDay() {
		Done.click();
	}
	public void clicktosearch() {
		search.click();
	}
	
}
