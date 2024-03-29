package php_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import com.custom.library.BasePage;

public class OneWayFlight extends BasePage {
	
	public OneWayFlight BookAFlight () throws Exception{
		
		
		driver.get("http://www.phptravels.net");
		Thread.sleep(2 * 1000);
		// Get Title of a WebPage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String sText = js.executeScript("return document.title;").toString();
		System.out.println("The website  title is  :" + sText);

		// click on Flight Icon
		//test case: when we click the flight icon, the browser should navigate to the flight section

		driver.findElement(By.xpath("//ul[@class='nav nav-tabs RTL nav-justified']/li[2]")).click();

		Thread.sleep(2000);
		driver.getTitle();
		
		//add validation point
		Assert.assertTrue(driver.getTitle().contains("Flights"), "Flights Icons does not navigate to th enext section");
		System.out.println("Flights Icon verified.- User is able to navigate to the Flight section");

		// switch to default frame since "return" is selected by default
		WebElement travelstartIframe = driver
				.findElement(By.xpath("//iframe[@id='travelstartIframe-dd7d2f33-38c3-4c69-baac-56d16157023b']"));

		driver.switchTo().frame(travelstartIframe);
		Thread.sleep(2000);

		// select oneway option
		
		driver.findElement(By.xpath("//*[@id='trip-type-radio-group']"));
		Thread.sleep(1 * 1000);
		 driver.findElement(By.xpath("//*[@id='trip-type-radio-group']/label[1]")).click();
		Thread.sleep(1 * 2000);
		
		//select departureCity
		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-orig')]")).sendKeys("Abidjan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-orig')]")).click();		
		Thread.sleep(1 * 2000);
		
		//select destination City
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-dest')]")).sendKeys("cdg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-dest')]")).click();
		
		Thread.sleep(1 * 2000);

	
		//select depart date//MAKE IT DYNAMIC
		
		
		
		driver.findElement(By.xpath("//span[starts-with(@id, 'depart-date-link')]")).click();
		Thread.sleep(1000);
		  
				  driver.findElement(By.xpath("//ts-search-depart-date[@class='floating-datepicker ng-scope ng-isolate-scope']"));

		  driver.findElement(By.cssSelector("button.datepicker__next-month")).click();
		  driver.findElement(By.xpath("//table[@class='table datepicker-table']"));
		  driver.findElement(By.xpath("//tbody/tr[3]/td[5]")).click();
		 
			Thread.sleep(1000);
		
		

		//select traveler
	// driver.findElement(By.xpath("//span[@id='add-traveller-link']")).click();	
	 driver.findElement(By.xpath("//div[@label='Adults']/button[@class='stepper--plus']")).click();
	 driver.findElement(By.xpath("//div[@label='Children']/button[@class='stepper--plus']")).click();;

		Thread.sleep(1000);
		//search button
		
		driver.findElement(By.cssSelector("#search-for-flights-button > span")).click();
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@class='alert alert--warning alert--warning-bg ng-scope']"));
		
		//capture alert or error message
		
		 if(text.getText() != null)
	     {
	      // System.out.println(text.get(i).getText());
			String alert = text.getText();
			System.out.println(alert);
	     }
	   System.out.println(driver.getTitle());
	   
	  // test to pass
	   
	   Assert.assertTrue(driver.getTitle().contains("Flights"), "browser navigate to next section");
		 System.out.println("Flight page. User cannot proceed with the search");
		 
		 
		 //test to fail
		/*	Assert.assertTrue(!driver.getTitle().contains("Flights"), "Browser stay on Flight section");
		 System.out.println("Next page. User can proceed with the search");*/
		 
		 
		 
		/* Assert.assertFalse(driver.getTitle().contains("Flights"),"Browser stay on Flight section");
		 System.out.println("Next page. User can proceed with the search.");
*/



	 
	 return this;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //locate plussign
	// WebElement plusSign = 
			 
	// WebElement TravelNumb= driver.findElement(By.xpath("//input[@class='stepper-text ng-pristine ng-valid ng-touched']"));
	// WebElement alert= driver.findElement(By.xpath("//span[@class='ng-binding ng-scope']"));
	/*while (true){
		plusSign.click();
		if(alert.getText().contains("maximum")){
			
			System.out.println(alert.getText());
			break;
		}
	}*/
	

			
	
		  
	}
}

	/*
	 

			
			public void selectTravelorTypeNumber(String travelorType, String travelorNumber) throws Exception {
				// driver.findElement(By.xpath("//span[@id='add-traveller-link']")).click();
				 
				 WebElement dropDownElem = driver.findElement(By.xpath("//ts-search-travellers[@class='floating-travellers ng-scope ng-isolate-scope']"));

				// List<WebElement> stepperElems = dropDownElem.findElements(By.xpath("//div[@class='traveller-form']"));
				 List<WebElement> stepperElems = dropDownElem.findElements(By.xpath("//div[@class='stepper item-list--action ng-pristine ng-untouched ng-valid ng-isolate-scope ng-valid-out-of-bounds']"));
						// findElements(By.xpath("//div[@class='item']"));

				 
				 
				 for (WebElement option : stepperElems) {
					//	myLib.highlightElement(option);
						String txt = option.getAttribute("label");
						
						System.out.println(txt);
						if (txt.contains(travelorType)) {
							List<WebElement> icons = option.findElements(By.tagName("button"));
							System.out.println(icons.size());
							WebElement plusIcon = icons.get(1);
							int traNum = Integer.parseInt(travelorNumber);
							for (int i = 1; i <= traNum; i++) {
								plusIcon.click();
								myLib.customWait(0.5);
							}
							break;
						}
			}
			
		  
		 
			}		

		
	
}
*/