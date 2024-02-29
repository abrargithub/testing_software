package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellDealsPOM {
	
	 WebDriver driver;

		public DellDealsPOM (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/button/span")
		   WebElement click_delldeals;
		   public WebElement deals(){
			return click_delldeals;
		   }
		   
		   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/ul/li[3]/a")
		   WebElement click_ViewAllDeals;
		   public WebElement ViewAllDeals(){
			return click_ViewAllDeals;
			

}
}
