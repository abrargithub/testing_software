package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionServicePOM {
	
	 WebDriver driver;

	public DellActionServicePOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	   WebElement click_dellservice;
	   public WebElement service(){
		return click_dellservice;

	
	}
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	   WebElement click_ViewAllService;
	   public WebElement ViewAllservice(){
		return click_ViewAllService;

}
}	   
