package com.CucumberProject.framework.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CucumberProject.framework.helper.Testbase;

public class RegistrationPage {
	public static final Logger log = Logger.getLogger(RegistrationPage.class.getName());

	@FindBy(xpath = "//*[@id = 'customer_firstname']")
	WebElement firstname;
	@FindBy(xpath = "//*[@id='customer_lastname']")
	WebElement lastname;
	@FindBy(xpath = "//*[@id='passwd']")
	WebElement password;

	@FindBy(xpath = "//*[@id='days']")
	WebElement days;

	@FindBy(xpath = "//*[@id='months']")
	WebElement month;

	@FindBy(xpath = "//*[@id='years']")
	WebElement year;

	@FindBy(xpath = "//*[@id='firstname']")
	WebElement yourAddressFirstName;

	@FindBy(xpath = "//*[@id='lastname']")
	WebElement yourAddressLastName;

	@FindBy(xpath = "//*[@id='company']")
	WebElement yourAddressCompany;

	@FindBy(xpath = "//*[@id='address1']")
	WebElement address;

	@FindBy(xpath = "//*[@id='address2']")
	WebElement address2;

	@FindBy(xpath = "//*[@id='city']")
	WebElement yourAddressCity;

	@FindBy(xpath = "//*[@id='id_state']")
	WebElement yourAddressState;

	@FindBy(xpath = "//*[@id='postcode']")
	WebElement yourAddressPostCode;

	@FindBy(xpath = "//*[@id='id_country']")
	WebElement additionalInformation;

	@FindBy(xpath = "//*[@id='phone']")
	WebElement homePhone;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	WebElement mobilePhone;

	@FindBy(xpath = "//*[@id='alias']")
	WebElement addressAlias;

	@FindBy(xpath = "//*[@id='submitAccount']")
	WebElement registration;

	@FindBy(xpath = "//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]")
     WebElement registrationsuccessmsg;

	public RegistrationPage(WebDriver driver) {

		PageFactory.initElements(Testbase.driver, this);

	}

	public void selecttitle( String value) {

		List<WebElement> list = Testbase.driver.findElements(By.name("id_gender"));

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getAttribute("value").equals(value)) {

				list.get(i).click();
				log.info("selecte the tilte" + list.get(i).toString());

			}

		}
	}

	public void customerfirstname( String firstname ) {

		this.firstname.sendKeys(firstname);
		log.info("firstname is "+this.firstname.toString());
	}
	public void setLastname(String lastname) {
		log.info("entering lastname.." + lastname);
		this.lastname.sendKeys(lastname);
	}
	public void setPassword(String password) {
		log.info("entering password.." + password);
		this.password.sendKeys(password);
	}
   
	public void selectdropdown(String name, String value){
		
		Select dropdown = new Select(Testbase.driver.findElement(By.name(name)));
		dropdown.selectByValue(value);
		}

	public void setYourAddressFirstName(String yourAddressFirstName) {
		log.info("entering yourAddressFirstName.." + yourAddressFirstName);
		this.yourAddressFirstName.sendKeys(yourAddressFirstName);
	}

	public void setYourAddressLastName(String yourAddressLastName) {
		log.info("entering yourAddressLastName.." + yourAddressLastName);
		this.yourAddressLastName.sendKeys(yourAddressLastName);
	}

	public void setYourAddressCompany(String yourAddressCompany) {
		log.info("entering yourAddressCompany.." + yourAddressCompany);
		this.yourAddressCompany.sendKeys(yourAddressCompany);
	}

	public void setAddress(String address) {
		log.info("entering address.." + address);
		this.address.sendKeys(address);
	}
	public void setYourAddressCity(String yourAddressCity) {
		log.info("entering yourAddressCity.." + yourAddressCity);
		this.yourAddressCity.sendKeys(yourAddressCity);
	}
	public void setYourAddressPostCode(String yourAddressPostCode) {
		log.info("entering yourAddressPostCode.." + yourAddressPostCode);
		this.yourAddressPostCode.sendKeys(yourAddressPostCode);
	}
	public void setMobilePhone(String mobilePhone) {
		log.info("entering mobilePhone.." + mobilePhone);
		this.mobilePhone.sendKeys(mobilePhone);
	}

	public void setAddressAlias(String addressAlias) {
		log.info("entering addressAlias.." + addressAlias);
		this.addressAlias.sendKeys(addressAlias);
	}

	public void clickRegistration() {
		log.info("clicked on registration.." + registration);
		this.registration.click();
	}
	
	public boolean verifyregistrationsuccess(){
		
		if(registrationsuccessmsg.isDisplayed()){
			log.info("registration success msg"+registrationsuccessmsg.toString());
			return true;
		}
		else 
			return false;
		
	}
	
}
