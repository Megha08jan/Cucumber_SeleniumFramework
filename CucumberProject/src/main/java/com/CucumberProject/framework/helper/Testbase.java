package com.CucumberProject.framework.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Testbase {
	
	public static final Logger log = Logger.getLogger(Testbase.class.getName());
	
	public WebDriver driver;
	
	Properties OR = new Properties();
	
	
	public void loaddata() throws IOException {
		
	File file = new File (System.getProperty("user.dir")+"\\src\\main\\resources\\configfile\\config.properties");
	FileInputStream f = new FileInputStream(file);
	OR.load(f);
	}
	
	public void init() throws IOException{
		
		loaddata();

		selectBrowser(OR.getProperty("browser"));
	
		geturl(OR.getProperty("url"));
		String lo4jconfigpath = System.getProperty("user.dir")+"\\src\\main\\resources\\configfile\\log4j.properties";
		PropertyConfigurator.configure(lo4jconfigpath);
	}

	public void geturl(String url) {
	System.out.println(url);
		driver.get(url);
		log.info("url is " +url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void selectBrowser(String browser) {
		// TODO Auto-generated method stub
	System.out.println(browser);
		 System.setProperty("webdriver.chrome.driver", "D:\\seleniumex\\chromdriver_win32\\chromedriver.exe");
         log.info("creating the object of"+browser);
		    driver = new ChromeDriver();
		
	}

}
