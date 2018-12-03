package com.automation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.custom.library.BasePage;
import com.custom.library.ExcelManager;

public class DataProvidorTests extends BasePage{

	@DataProvider(name = "Login")
	public static Object[][] credentials()
	{
		ExcelManager reader = new ExcelManager("src/test/resources/Test_data_Ode1.xls");//create new object excelmanager ,excell file location must be added
		return reader.getExcelData("Sheet1");
	}
	
	@Test (dataProvider = "Login")//data provider annotation
	public void loginTest(String userName, String userPassword) throws InterruptedException
	{
		driver.get("http://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1*1000);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(userPassword);
		Thread.sleep(1*1000);
	}
	
	
}
