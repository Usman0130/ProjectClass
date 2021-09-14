package com.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	WebDriver driver;
	
	@BeforeMethod
	private void beforemethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Parameters({"username","password","location","Hotel","Roomtype","no.ofrooms","checkin","checkout","perroom","chldroom","Firstname","Lastname","address","ccno.","type","month","year","ccv"})
	@Test
	private void testdata1(String s,String s1,String d,String d1,String b1,String b2,String b3,String b4,String b5,String b6,String c,String c1,String c2,String c3,String c4,String c5,String c6,String h) throws InterruptedException {
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='username']"));
		txtusername.sendKeys(s);
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='password']"));
		txtpass.sendKeys(s1);
		WebElement btn = driver.findElement(By.xpath("//input[@id='login']"));
		btn.click();
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		location.sendKeys(d);
		WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Hotels.sendKeys(d1);
		WebElement ddnttype = driver.findElement(By.xpath("//select[@id='room_type']")); 
		ddnttype.sendKeys(b1);
		WebElement ddnrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		ddnrooms.sendKeys(b2);
		WebElement date1 = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date1.sendKeys(b3);
		WebElement date2 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		date2.sendKeys(b4);
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		adult.sendKeys(b5);
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		child.sendKeys(b6);
		WebElement btn1 = driver.findElement(By.xpath("//input[@id='Submit']"));
		btn1.click();
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();
		WebElement cntue = driver.findElement(By.id("continue"));
		cntue.click();
		WebElement frstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		frstname.sendKeys(c);
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys(c1);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys(c2);
		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardno.sendKeys(c3);
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cardtype.sendKeys(c4);
		WebElement expirymnth = driver.findElement(By.id("cc_exp_month"));
		expirymnth.sendKeys(c5);
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		expiryyear.sendKeys(c6);
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys(h);
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	}
		