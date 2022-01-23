package ExpediaPagesObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia_home {
	public WebDriver driver;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]") WebElement flight;
	@FindBy(xpath="//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")WebElement roundT;
	@FindBy(id="id=\"location-field-leg1-origin\"")WebElement departure;
	@FindBy(xpath="//*[@id=\"app-layer-origin-flight\"]/div[2]/div/div[2]/div/div/svg")WebElement Searchcity;
	@FindBy(id="location-field-leg1-destination")WebElement arrival;
	@FindBy(xpath="//button[@id='d1-btn']")WebElement departingday;
	@FindBy(xpath="//button[@id='d2-btn']")WebElement arrivingday;
	@FindBy(xpath="//button[contains(text(),'Search')]")WebElement search;
	public Expedia_home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void clickonFlights() {
		flight.click();
	}
	public void Triptype() {
		roundT.click();
	}
	
	public void Setdeparturecity() {
		
		departure.click();
		departure.sendKeys("chicago il");
	}
	public void SearchCity() {
		Searchcity.click();
	}
	public void setarrivalcity() {
		arrival.sendKeys("washington dc");
		
	}
	public void setdepartingday() {
		departingday.sendKeys("feb 30");;
	}
	public void setarrivinbday() {
		arrivingday.sendKeys("march 30");
	}
	public void clicktosearch() {
		search.click();
	}
	
}









