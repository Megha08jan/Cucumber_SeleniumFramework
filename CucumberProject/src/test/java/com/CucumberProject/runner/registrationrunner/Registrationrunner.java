package com.CucumberProject.runner.registrationrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"classpath:featurefile/registration/registration1.feature"}, glue = 
{"classpath:com.CucumberProject.stepdifinition.login","classpath:com.CucumberProject.stepdifinition.registration","classpath:com.CucumberProject.framework.helper"}, plugin={"html:target/cucumber-html-report"})
public class Registrationrunner extends AbstractTestNGCucumberTests {

}
