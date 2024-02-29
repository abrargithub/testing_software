package com.nexttechitc.Stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;
import com.nexttechitc.Pageobjectmodel.BestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	
	WebDriver driver;
	
	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
		
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
				
			
				// how to open URL
				driver.get("https://www.amazon.com/");
	   
	    
	}

	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
		AmazonsearchPOM Amazonsearch= new AmazonsearchPOM(driver);
		Amazonsearch.amazonsearch().sendKeys(arg1);
		Amazonsearch.amazonsearchbutton().click();
	    
	}

	@Then("^User should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
		
		
		
	    
	}

}
