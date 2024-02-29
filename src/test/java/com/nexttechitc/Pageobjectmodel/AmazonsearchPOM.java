package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	
	WebDriver driver;
	
	public AmazonsearchPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(name="field-keywords")
	   WebElement type_search;
	   public WebElement amazonsearch(){
		return type_search;
	   }
		
		@FindBy(id="nav-search-submit-button")
		   WebElement click_searchbutton;
		   public WebElement amazonsearchbutton(){
			return click_searchbutton;


}
	   }

