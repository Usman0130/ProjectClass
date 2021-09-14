package com.training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends baseClass{
	public static void main(String[] args) throws IOException {
		getDriver();
		getUrl("https://blazedemo.com/");
		maximize();
		Testing a = new Testing();
		WebElement getdeparturecity = a.getdeparturecity();
		String departure = getdata(1,0);
		type(getdeparturecity, departure);
		
		WebElement getdestinationcity = a.getdestinationcity();
		String destination = getdata(1,1);
		type(getdestinationcity, destination);
		WebElement getfindingflights = a.getfindingflights();
		getfindingflights.click();
		
		ParisToLondon b = new ParisToLondon();
		WebElement choosetheFlights = b.getChoosetheFlights();
		choosetheFlights.click();
		
		PersonalDetails c = new PersonalDetails();
		type(c.getFirstName(), getdata(1, 2));
		type(c.getAddress(), getdata(1, 3));
		type(c.getCity(), getdata(1, 4));
		type(c.getState(), getdata(1, 5));
		type(c.getZipcode(), getdata(1, 6));
		type(c.getCardtype(), getdata(1, 7));
		type(c.getCreditcardnumber(), getdata(1, 8));
		type(c.getMonth(), getdata(1, 9));
		type(c.getYear(), getdata(1, 10));
		type(c.getNameoncard(), getdata(1, 11));
		WebElement purchaseFlight = c.getPurchaseFlight();
		purchaseFlight.click();
		
		WebElement table = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
		String text = table.getText();
		System.out.println(text);
		Outputstream(1, 12, text);
		
	}
	
	
}
