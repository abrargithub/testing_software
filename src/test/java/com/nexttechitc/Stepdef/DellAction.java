package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionServicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	
	WebDriver driver;
	
	@Given("^user visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
			
				// how to open URL
				driver.get("https://www.facebook.com/reg/");
				//maximize window
				driver.manage().window().maximize();
	   
	}

	@When("^user go to service dropdown menu and able to see View All Service$")
	public void user_go_to_service_dropdown_menu_and_able_to_see_View_All_Service() throws Throwable {
		Actions act=new Actions(driver);
		DellActionServicePOM ser = new DellActionServicePOM(driver);
		act.moveToElement(ser.service()).build().perform();
		Thread.sleep(5000);
		ser.ViewAllservice().click();
	   
	}

	@Then("^user redirects to view all service$")
	public void user_redirects_to_view_all_service() throws Throwable {
	   
	}

}
