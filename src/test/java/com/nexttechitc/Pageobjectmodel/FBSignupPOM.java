package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM {
	
WebDriver driver;
	
	public FBSignupPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@name=\"firstname\"]")
	   WebElement type_firstname;
	   public WebElement firstname(){
		return type_firstname;
	   }
		
		@FindBy(name="lastname")
		   WebElement type_lastname;
		   public WebElement lastname(){
			return type_lastname;

           }
		   @FindBy(name="reg_email__")
		   WebElement type_emailid;
		   public WebElement emailid(){
			return type_emailid;
		   }
		   @FindBy(id="password_step_input")
		   WebElement type_password;
		   public WebElement password(){
			return type_password;
		   }
		   @FindBy(xpath="//*[@id=\"month\"]")
		   public WebElement click_month;


		   @FindBy(id="day")
		   public WebElement click_day;


		   @FindBy(id="year")
		   public WebElement click_year;
}
