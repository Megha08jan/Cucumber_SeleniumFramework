package com.CucumberProject.framework.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberProject.framework.helper.Testbase;

public class Loginpage {

	public static final Logger log = Logger.getLogger(Loginpage.class.getName());
	
	
	
	@FindBy(xpath = "//*[@class = 'login']")
	WebElement Signin;
	
	@FindBy(xpath ="//*[@id ='email']")
	WebElement emailid;
	
	@FindBy(xpath ="//*[@id ='passwd']")
	WebElement pwd;
	
	@FindBy(xpath = "//*[@class ='icon-lock left']")
	WebElement signinbutton;
	

	@FindBy(xpath = "//*[@id = 'email_create']")
	WebElement emailadd;	
	
	@FindBy(xpath ="//*[@id='SubmitCreate']")
	public WebElement createaccount;
	
	public Loginpage(WebDriver driver){
	PageFactory.initElements(Testbase.driver, this);
	
	}
	
	public void clickonsigninlink(){
		
	//	log.info("clicked on signin"+Signin.toString());
		Signin.click();
	
		
	}

	public void enteremailaddress(String emailid){
		
		this.emailid.sendKeys(emailid);
		log.info("entered emailid is"+this.emailid.toString());
		
	}
	
public void enterpassword(String pwd){
		
		this.pwd.sendKeys(pwd);
		log.info("entered password is"+this.pwd.toString());
		
	}
	
public void clickonSigninbutton(){
	
	signinbutton.click();

	log.info("clicked on signinbutton"+signinbutton.toString());
}
	
public void enteremailadd(String emailadd) throws InterruptedException{
	this.emailadd.sendKeys(emailadd);
	log.info("entred emailaddress"+this.emailadd.toString());	

}

public RegistrationPage createaccount1(WebElement element){
	element.click();
	return new RegistrationPage(Testbase.driver);
}

}
