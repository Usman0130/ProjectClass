package com.training;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class baseClass {
	static WebDriver driver;
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static String getdata(int row, int cell) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Student\\Excel\\FrameWork.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		if (type == 1) {
			data = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date value = c.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
				data = date.format(value);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				data = String.valueOf(l);
			}
		}
		return data;
	}
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	 public String getAttribute(WebElement element) {
	 return element.getAttribute("value");
	 }
	
	 public void quit() {
	 driver.quit();
	 }
	 public String getCurrentUrl() {
	 return driver.getCurrentUrl();
	 }
	 public String getTitle() {
	 return driver.getTitle();
	 }
	 public List<String> getOptions(WebElement element) {
	 Select select = new Select(element);
	 List<WebElement> alloptions = select.getOptions();
	 WebElement element2 = alloptions.get(1);
	 String string = element2.getText();
	 System.out.println(string);
	 return null;
	 }
	 public void selectOptionIndex(WebElement element,int index) {
	 new Select(element).selectByIndex(index);
	 }
	 public void selectoptionbyAttribute(WebElement element,String data) {
	 new Select(element).selectByVisibleText(data);
	 }
	 public void selectoptionbytext(WebElement element,String data) {
	 WebElement firstSelectedOption = new
	 Select(element).getFirstSelectedOption();
	 }
	 public void deselectbyindex(WebElement element,String data) {
	 new Select(element).deselectByIndex(0);
	 }
	 public void deselectbyvalues(WebElement element,String data) {
	 new Select(element).deselectByValue("value");
	 }
	 public void deselectall(WebElement element,String data) {
	 new Select(element).deselectAll();
	 }
	 public void deselectbyvisibletext(WebElement element,String data) {
	 new Select(element).deselectByVisibleText(data);
	 }
	 public boolean isMultile(WebElement element,boolean status) {
	 return new Select(element).isMultiple();
	 }
	
	public static String Outputstream(int rownum, int cellnum, String data) throws IOException {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Student\\Excel\\FrameWork.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream s = new FileOutputStream(file);
		workbook.write(s);
		return data;
 }
 }