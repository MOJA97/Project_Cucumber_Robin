package com.adactinDEMO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.com.Reusable_Methods;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = ".//FeatureTestcase", glue = "org" )

public class Adactin_Demo extends Reusable_Methods {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {

		browser_Launch("Chrome");
		
		window_Manage("maximum");
	}
	
	@AfterClass
	public static void close_Browser() {
		
		driver.quit();

		
	}
	
	
}
