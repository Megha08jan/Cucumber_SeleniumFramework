package com.CucumberProject.stepdifinition.productcategory;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.CucumberProject.framework.helper.Testbase;
import com.CucumberProject.framework.pageobject.Homepage;
import com.CucumberProject.framework.pageobject.ProductCategory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductsofWomen extends Testbase {
	public static final Logger log = Logger.getLogger(ProductsofWomen.class.getName());
	Homepage homepage ;
	ProductCategory productcategory;
	
	@Given("^user click on women navigation menu$")
	public void user_click_on_women_navigation_menu()  {
	    
		homepage = new Homepage(driver);
		 productcategory = homepage.clickonmenu(homepage.womenproduct);
	}
	

	@Then("^verify total numbe of women product displayed as \"([^\"]*)\"$")
	public void verify_total_numbe_of_women_product_displayed_as(String noofproducts)  {
	    
		int total = productcategory.gettotalproduct();
		
		if(total == Integer.parseInt(noofproducts)){
			
			Assert.assertTrue(true, "count is matching with runtime production data");
			
		}
		
		else{
			Assert.assertTrue(false, "count is not matching with runtime production data");
		}
		
	    
	}


	
}
