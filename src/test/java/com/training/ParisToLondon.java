package com.training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParisToLondon extends baseClass{
	public ParisToLondon() {
		PageFactory.initElements(driver, this);
}
	public WebElement getChoosetheFlights() {
		return choosetheFlights;
	}
	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")
	private WebElement choosetheFlights;
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

