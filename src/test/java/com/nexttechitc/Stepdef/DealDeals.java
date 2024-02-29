package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionServicePOM;
import com.nexttechitc.Pageobjectmodel.DellDealsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealDeals {
	
	WebDriver driver;
	
	@Given("^user goes to Dell homepage$")
	public void user_goes_to_Dell_homepage() throws Throwable {
		
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
	
		// how to open URL
		driver.get("https://www.dell.com/en-us.com/");
		//maximize window
		driver.manage().window().maximize();
	    
	}

	@When("^user go to deal dropdown menu and able to see View All Deals$")
	public void user_go_to_deal_dropdown_menu_and_able_to_see_View_All_Deals() throws Throwable {
		Actions ac=new Actions(driver);
		DellDealsPOM dea = new DellDealsPOM(driver);
		ac.moveToElement(dea.deals()).build().perform();
		Thread.sleep(5000);
		dea.ViewAllDeals().click();
	   
	}

	@Then("^user redirects to view all deals page$")
	public void user_redirects_to_view_all_deals_page() throws Throwable {
	   
	}

}
