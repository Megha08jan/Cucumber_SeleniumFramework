package com.CucumberProject.runner.login;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ={"classpath:featurefile/login/login.feature"},
glue={"classpath:com.CucumberProject.stepdifinition.login","classpath:com.CucumberProject.framework.helper"},
plugin = {"html:target/cucumber-html-report"})
public class Loginrunner extends AbstractTestNGCucumberTests {

}
