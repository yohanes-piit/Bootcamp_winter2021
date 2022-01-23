package ExpediaPagesObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_cheekout {
	WebDriver driver;
	@FindBy(xpath="//input[@id='firstname[0]")WebElement fname;
	@FindBy(id="lastname[0]")WebElement lname;
	@FindBy(id="country_code[0]")WebElement country;
	@FindBy(id="phone-number[0]")WebElement phone;
	@FindBy(id="gender_male[0]")WebElement gender;
	@FindBy(id="date_of_birth_month0")WebElement birthmonth;
	@FindBy(id="date_of_birth_day[0]")WebElement birthday;
	@FindBy(id="date_of_birth_year[0]")WebElement birthyear;
	@FindBy(xpath="//body/div[@id='site-content']/div[1]/div[13]/section[2]/article[4]/fieldset[1]/div[1]/div[2]/ul[1]/li[1]")WebElement billing;
	@FindBy(name="creditCards[0].cardholder_name")WebElement nameoncard;
	@FindBy(id="creditCardInput")WebElement cardno;
	@FindBy(name="creditCards[0].expiration_month")WebElement expiration;
	@FindBy(name="creditCards[0].expiration_year")WebElement expyear;
	@FindBy(name="cardSecurityCode_1")WebElement seccode;
	@FindBy(id="FLT.CKO.BILLINGCOUNTRY")WebElement teritory;
	@FindBy(name="creditCards[0].street")WebElement Billaddress;
	@FindBy(name="creditCards[0].city")WebElement city;
	@FindBy(name="creditCards[0].state")WebElement state;
	@FindBy(name="zipcode")WebElement zip;
	@FindBy(name="CKO.CONFEMAILADDRESS")WebElement email;
	@FindBy(xpath="//button[@id='complete-booking']")WebElement book;
	public  Expedia_cheekout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Entername() {
		fname.sendKeys("yohanes");
	}
	public void Enterlastname() {
		lname.sendKeys("Girata");
	}
	public void Selectcountry() {
		country.click();
		Select obj1= new Select(country);
		obj1.selectByVisibleText("united states of america +1");
		
	}
	public void Setphone() {
		phone.sendKeys("7732224455");
	}
	public void SelectGender() {
		gender.click();
	}
	public void Birthmonth() {
		Select obj2=new Select(birthmonth);
		obj2.selectByValue("02-Feb");
	}
	public void Birthdate() {
		Select obj3= new Select( birthday);
		obj3.selectByValue("12");
		 	
	}
	public void Birthyear() {
	Select obj4= new Select(birthyear);
	obj4.selectByVisibleText("1979");
		
	}
	public void payment() {
		 billing.click();
	}
	public void Nameoncard() {
		nameoncard.sendKeys("yohanes");
	}
	public void Entercardno() {
		cardno.sendKeys("2424242424242424");
	}
	public void CardExpmonth() {
		Select obj5= new Select(expiration);
		obj5.selectByValue("05-may");
	}
	public void CardExpyear() {
		
		Select obj6= new Select( expyear);
		obj6.selectByValue("2025");
	}
	public void Securitycode() {
		seccode.sendKeys("123");
	}
	public void Billingaddress() {
		Select obj7= new Select(teritory);
		obj7.selectByValue("united states of america");
	}
	public void CaredAddress() {
		Billaddress.sendKeys("2142 W rosemont ave");
	}
	public void State() {
		Select obj8= new Select(state);
		obj8.selectByValue("IL");
	}
	public void EnterZipcode() {
		zip.sendKeys("6064");
	}

	public void SetEmail() {
		email.sendKeys("yohanes@.com");
	}
	public void completeBooking() {
		book.click();
	}

}
