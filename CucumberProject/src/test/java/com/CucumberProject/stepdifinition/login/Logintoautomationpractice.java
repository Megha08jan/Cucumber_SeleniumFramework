package com.CucumberProject.stepdifinition.login;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.CucumberProject.framework.helper.Testbase;
import com.CucumberProject.framework.pageobject.Loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Logintoautomationpractice extends Testbase {
	public static final Logger log = Logger.getLogger(Logintoautomationpractice.class.getName());
	Loginpage loginpage;
	
@Given("^Navigate to application$")
public void navigate_to_application() throws IOException  {
	init();
}

@When("^user click on sign in$")
public void user_click_on_sign_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 loginpage = new Loginpage(driver);;

	loginpage.clickonsigninlink();
	
}

@And("^enter email address as \"([^\"]*)\"$")
public void enter_email_address_as(String emailid) throws InterruptedException  {
    // Write code here that turns the phrase above into concrete actions
   loginpage.enteremailaddress(emailid);
   Thread.sleep(20);
}

@When("^enter password as \"([^\"]*)\"$")
public void enter_password_as(String pwd)  {
    // Write code here that turns the phrase above into concrete actions
   loginpage.enterpassword(pwd);
}

@Then("^login is successful$")
public void login_is_successful() {
    // Write code here that turns the phrase above into concrete actions
   loginpage.clickonSigninbutton();
}


}
