package parkingCalculator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import com.custom.library.BasePage;


public class ParkingFees extends BasePage {
	
	// 1- Scenario- launch the website
	

		public ParkingFees goto_AdamGoucherWebsite() {
			driver.get("http://adam.goucher.ca/parkcalc/");
			String websiteTitle = driver.getTitle();
			System.out.println("the website title is :" + websiteTitle);
			String expectedTitle = ("Parking Calculator");
			assertEquals(websiteTitle, expectedTitle);

			return this;
		}
		
		public ParkingFees my_Park_Info() throws Exception{
			myLib.selectDropDown(By.id("Lot"), "Economy Parking");
			
			
		//	Verify format for entry/exit date and time and verify that the exit date and time is after the entry date and time
			
			//Choose Entry Date and Time
			driver.findElement(By.id("EntryTime")).clear();
			myLib.enterTextField(By.id("EntryTime"),"400" );//test fail . there is a bug here . should follow format
			myLib.handleCheckBox(By.cssSelector("input[value='PM']"), true);			
			//myLib.enterTextField(By.id("EntryDate"), "40502050");//test failed, exit date format
			driver.findElement(By.tagName("a")).click();
			((JavascriptExecutor)driver).executeScript("document.getElementById('EntryDate').value='40/50/2050'");
			myLib.customWait(0.5);

			//Choose Leaving Date and Time
			
			//case 1: exit date is earlier  entry date
			//myLib.enterTextField(By.id("ExitTime"),"300" );//test fail . there is a bug here . should follow format,
			//case 2: exit date is after  entry date
			driver.findElement(By.id("ExitTime")).clear();
			myLib.enterTextField(By.id("ExitTime"),"500" );//test fail . there is a bug here . should follow format,
			myLib.handleCheckBox(By.cssSelector("input[value='PM']"), true);			
			//myLib.enterTextField(By.id("ExitDate"), "40502050");//test fail , format			
			driver.findElement(By.tagName("a")).click();
			((JavascriptExecutor)driver).executeScript("document.getElementById('ExitDate').value='40/50/2050'");
			myLib.customWait(1);
			driver.findElement(By.cssSelector("input[value='Calculate']")).click();
			myLib.customWait(2);
			//CASE 1: ERROR! YOUR EXIT DATE OR TIME IS BEFORE YOUR ENTRY DATE OR TIME  : test PASS
			//CASE 2: No error message,  test PASS
			//JavaScriptInCalendar("01/04/2018");
			
			return this;
		}
		
		/*public static void  select_A_date(String dateChosen)
		{
			driver.findElement(By.tagName("a")).click();*/
		
			
		
		
		/*private   void JavaScriptInCalendar(String value)
		{
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			String script= "arguments[0].setAttribute('value','"+value+"');";
			jse.executeScript(script);	
			
			 driver.findElement(By.id("ExitDate"));
			JavaScriptInCalendar(value);
		
			
			// Locating departure date calendar
			
			
		
			}*/
	}


