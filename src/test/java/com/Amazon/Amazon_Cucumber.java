package com.Amazon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.AmazonPOM.com.Signin_Page;
import com.BaseClass.com.Reusable_Methods;

public class Amazon_Cucumber extends Reusable_Methods{
	public static WebDriver driver =  browser_Launch("Chrome");
	
	static Signin_Page signin = new Signin_Page(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		get_Url("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		window_Manage("Maximize");

		send_Values(signin.getUsername(), "mojavedch@gmail.com");
		
		click(signin.getContinuebtn());
		
		send_Values(signin.getPassword(), "Array[]={Amazon};");
		
		Thread.sleep(4000);
		screenshot(driver, "C:\\Users\\Javed\\eclipse-workspace\\Project_Cucumber\\Amazon_Cucumber\\signin.png");
		
		click(signin.getSigninBTN());
		
		
		
	}

}
