package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FBSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignup {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		
		try { //how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		// how to open URL
		driver.get("https://www.facebook.com/reg/");
		//maximize window
		driver.manage().window().maximize();
	   
	}
		catch( Exception e) {
			System.out.println("browser and url not opening ");
			}
	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2) throws Throwable {
		
		try { FBSignupPOM signup= new FBSignupPOM(driver);
		signup.firstname().sendKeys(arg1);
		signup.lastname().sendKeys(arg2);
		}
		
		catch( Exception e) {
			System.out.println("First and last name missing ");
			}
	   
	}

	@When("^valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void valid_and(String arg1, String arg2) throws Throwable {
		try { FBSignupPOM signup= new FBSignupPOM(driver);
		signup.emailid().sendKeys(arg1);
		signup.password().sendKeys(arg2);
		}
		catch( Exception e) {
			System.out.println("email and password ");
			}
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		try { FBSignupPOM signup= new FBSignupPOM(driver);
		
		
		Select dropdown=new Select (signup.click_month);
		dropdown.selectByIndex(2);
		
		Select dropdown1=new Select (signup.click_day);
		dropdown1.selectByValue("2");
		
		Select dropdown2= new Select (signup.click_year);
		dropdown2.selectByVisibleText("2000");
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		//driver.close();
		driver.quit();
		}
		catch( Exception e) {
			System.out.println("month, day and year not valid ");
			}
	}


}
