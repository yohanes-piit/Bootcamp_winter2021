package ExpediaPagesObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Expedia_Triptype {
	WebDriver driver;
	@FindBy(xpath="//body/div[@id='app-flights-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[2]/div[3]/div[1]/section[1]/main[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/button[1]")WebElement flightsearch;
	@FindBy(xpath="//body/div[@id='app-flights-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-fullscreenDialog-details-and-fares-dialog']/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/button[1]")WebElement select;

	public Expedia_Triptype(WebDriver driver) {
		this.driver=driver;
	}
	public void searchforflight() {
		flightsearch.click();
		
	}
	public void selectforflight() {
		select.click();
	}
}
