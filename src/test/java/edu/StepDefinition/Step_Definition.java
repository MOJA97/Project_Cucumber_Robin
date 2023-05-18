package edu.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.com.Reusable_Methods;
import com.POM.com.Login_page;
import com.POM.com.Search_Hotel_Page;
import com.POM.com.Select_Hotel_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Reusable_Methods{
	
	
	// use POM
	public static Login_page login = new Login_page(driver);
	public static Search_Hotel_Page Search = new Search_Hotel_Page(driver);
	public static Select_Hotel_Page select = new Select_Hotel_Page(driver);
	
	@Given("user can be able to launch the url")
	public void user_can_be_able_to_launch_the_url() {
		
		get_Url("https://adactinhotelapp.com/");
		
	}
	
	@When("user can be able to enter the username in textbox")
	public void user_can_be_able_to_enter_the_username_in_textbox() {
		
		send_Values(login.getUserLP(), "JavedMo7");
	
	}
	
	@When("user can be able to enter the password in textbox")
	public void user_can_be_able_to_enter_the_password_in_textbox() {
		
		send_Values(login.getPassLP(), "JAVED987654!");

	}
	
	@Then("user can be able to click on the login button and the page should navigates to the search hotel page")
	public void user_can_be_able_to_click_on_the_login_button_and_the_page_should_navigates_to_the_search_hotel_page() {
	
		click(login.getLogin_btnLP());
	}

	
}
