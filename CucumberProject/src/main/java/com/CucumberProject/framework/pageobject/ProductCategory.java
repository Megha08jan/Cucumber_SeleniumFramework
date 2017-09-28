package com.CucumberProject.framework.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberProject.framework.helper.Testbase;

public class ProductCategory extends Testbase {
	public static final Logger log = Logger.getLogger(ProductCategory.class.getName());
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	List<WebElement> totalproduct;
	
	
	public ProductCategory(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public int gettotalproduct(){
		
		return totalproduct.size();
		
	}

	
}
