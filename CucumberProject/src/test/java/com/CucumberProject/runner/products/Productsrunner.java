package com.CucumberProject.runner.products;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"classpath:featurefile/products.feature"},glue =
{"classpath:com.CucumberProject.stepdifinition.login","com.CucumberProject.stepdifinition.productcategory","classpath:com.CucumberProject.framework.helper"}, 
plugin = {"html:target/cucumber-html-report"})
public class Productsrunner extends AbstractTestNGCucumberTests {

}
