package com.CucumberProject.stepdifinition.registration;



import org.apache.log4j.Logger;

import com.CucumberProject.framework.helper.Testbase;
import com.CucumberProject.framework.pageobject.Loginpage;
import com.CucumberProject.framework.pageobject.RegistrationPage;

import cucumber.api.java.en.Then;

public class UserRegistrationpage  {
	public static final Logger log = Logger.getLogger(UserRegistrationpage.class.getName());
	Loginpage loginpage;
	RegistrationPage registrationpage;
	
	
	@Then("^user enter emailaddress \"([^\"]*)\"$")
	public void user_enter_emailaddress(String emailaddr) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage = new Loginpage(Testbase.driver);
	loginpage.enteremailadd(emailaddr);
	Thread.sleep(4000);
	}

	@Then("^click on create account$")
	public void click_on_create_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   registrationpage = loginpage.createaccount1(loginpage.createaccount);
	}

	@Then("^user select title as mrs$")
	public void user_select_title_as_mrs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		registrationpage.selecttitle("2"); 
	
	}
	@Then("^user enters firstname \"([^\"]*)\"$")
	public void user_enters_firstname(String firstname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.customerfirstname(firstname);
	}

	@Then("^user enters lastname \"([^\"]*)\"$")
	public void user_enters_lastname(String lastname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setLastname(lastname);
	}

	@Then("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setPassword(password);
	}

	@Then("^user selects day \"([^\"]*)\"$")
	public void user_selects_day(String day) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.selectdropdown("days", day);
	}

	@Then("^user selects month \"([^\"]*)\"$")
	public void user_selects_month(String month) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.selectdropdown("months", month);
	
	}

	@Then("^user selects year \"([^\"]*)\"$")
	public void user_selects_year(String year) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.selectdropdown("years", year);
	
	}

	@Then("^user enters address firstname \"([^\"]*)\"$")
	public void user_enters_address_firstname(String addressfirstname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		registrationpage.setYourAddressFirstName(addressfirstname);
	
	}

	@Then("^user enters address lastname \"([^\"]*)\"$")
	public void user_enters_address_lastname(String addresslastname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setYourAddressLastName(addresslastname);
	
	}

	@Then("^user enters company name \"([^\"]*)\"$")
	public void user_enters_company_name(String companyname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setYourAddressCompany(companyname);
	}

	@Then("^user enters address\"([^\"]*)\"$")
	public void user_enters_address(String address) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setAddress(address);
	
	}

	@Then("^user enters city \"([^\"]*)\"$")
	public void user_enters_city(String city) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setYourAddressCity(city);
	}
	
	@Then("^user select state \"([^\"]*)\"$")
	public void user_select_state(String state) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	registrationpage.selectdropdown("id_state", state);
	
	}

	@Then("^user enters zipcode \"([^\"]*)\"$")
	public void user_enters_zipcode(String zipcode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setYourAddressPostCode(zipcode);
	}

	@Then("^user enters mobile no \"([^\"]*)\"$")
	public void user_enters_mobile_no(String mobileno) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	registrationpage.setMobilePhone(mobileno);
	}

	@Then("^user enters address aias\"([^\"]*)\"$")
	public void user_enters_address_aias(String addressalias) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	registrationpage.setAddressAlias(addressalias);
	
	}
	
	@Then("^click on register button$")
	public void click_on_register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 registrationpage.clickRegistration();
	}


	@Then("^Verfiy registration  success$")
	public void verfiy_registration_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	try {
		org.testng.Assert.assertEquals(registrationpage.verifyregistrationsuccess(), true);
		log.info("registration successfull");
	} catch (AssertionError e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		org.testng.Assert.assertTrue(false, "registration is not successful");
	}
	
	}


}
