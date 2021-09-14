package com.training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class PersonalDetails extends baseClass{
	public PersonalDetails() {
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath="//input[@id='inputName']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@id='address']")
	private WebElement address;
	
	
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getNameoncard() {
		return nameoncard;
	}
	public WebElement getPurchaseFlight() {
		return purchaseFlight;
	}
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	@FindBy(xpath="//input[@id='zipCode']")
	private WebElement zipcode;
	@FindBy(xpath="//select[@id='cardType']")
	private WebElement cardtype;
	@FindBy(xpath="//input[@id='creditCardNumber']")
	private WebElement creditcardnumber;
	@FindBy(xpath="//input[@id='creditCardMonth']")
	private WebElement month;
	@FindBy(xpath="//input[@id='creditCardYear']")
	private WebElement year;
	@FindBy(xpath="//input[@id='nameOnCard']")
	private WebElement nameoncard;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchaseFlight;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
