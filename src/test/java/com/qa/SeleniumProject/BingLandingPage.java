package com.qa.SeleniumProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingLandingPage {
	
	@FindBy(id = "sb_form_q")
	private WebElement searchBox;
	
	@FindBy(xpath = "/html/body")
	private WebElement paintBody;
	
	
	public void searchBing(String searchText) {
	
		searchBox.sendKeys(searchText);
		searchBox.submit();
	}
	
	public void paintName() {
		
	
	}
	
	

}
