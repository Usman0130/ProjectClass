package com.training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing extends baseClass{
		public Testing() {
			PageFactory.initElements(driver, this);
	}
		@FindBy(name="fromPort")
		private WebElement departure;
		@FindBy(name="toPort")
		private WebElement destination;
		@FindBy(xpath ="//input[@class='btn btn-primary']")
		private WebElement findflights;
		
		
		public WebElement getdeparturecity() {
			return departure;
		}
		public WebElement getdestinationcity() {
			return destination;
		}
		public WebElement getfindingflights() {
			return findflights;
		}
		



}

