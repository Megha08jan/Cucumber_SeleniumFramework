package com.CucumberProject.framework.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberProject.framework.helper.Testbase;

public class Homepage extends Testbase {

	public static final Logger log = Logger.getLogger(Homepage.class.getName());	
    WebDriver driver;

@FindBy(xpath = "//*[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a")
public WebElement womenproduct;


public Homepage(WebDriver driver){
	
	this.driver = driver;
	System.out.println(this.driver);
	PageFactory.initElements(driver, this);
}

//public ProductCategory clickonmenu(WebElement element){
//	
//	element.click();
//	log.info("clicked on" +element.toString()+ "category");
//	return new ProductCategory(driver);
//}
	
public ProductCategory clickonmenu(WebElement element){
	
element.click();
return new ProductCategory(driver);
}

}
