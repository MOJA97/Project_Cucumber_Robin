package com.AmazonPOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.com.Reusable_Methods;

public class Signin_Page extends Reusable_Methods{
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continuebtn;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//input[contains(@id,'signInSubmit')]")
	private WebElement signinBTN;
	
	public Signin_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSigninBTN() {
		return signinBTN;
	}
	
	

	
}
