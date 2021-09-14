package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class Automation {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Student\\Excel\\text.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement ddncountries = driver.findElement(By.id("countries"));
		Select select = new Select(ddncountries);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			for (int j = 0; j < options.size(); j++) {
				Row row = sheet.createRow(i);
				for (int k = 0; k < 1; k++) {
					Cell cell = row.createCell(0);
					cell.setCellValue(text);
					
				}
				
				
			}
			
		}
		FileOutputStream stream = new FileOutputStream(file);
				workbook.write(stream);
				System.out.println("done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

}
