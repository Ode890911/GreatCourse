package php_Project;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class HomePagePhP extends BasePage{
	
	final static Logger logger = Logger.getLogger(HomePagePhP.class);
	
	// 1- Scenario- launch the website
	

	public HomePagePhP goto_PhPeWebsite() {
		driver.get("http://www.phptravels.net");
		String websiteTitle = driver.getTitle();
		System.out.println("the website title is :" + websiteTitle);
		String expectedTitle = ("PHPTRAVELS | Travel Technology Partner");
		assertEquals(websiteTitle, expectedTitle);

		return this;
	}
	
	//verify logo displayed
	
	//we need javascript executor
	public HomePagePhP VerifyLogo(){
		JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement LogoFile = 	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/a/img"));
   Boolean ImagePresent = (Boolean) (js).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", LogoFile);

	
	Assert.assertTrue(ImagePresent,  "Logo is not displayed");
	System.out.println("Logo is displayed");
	
	
	
    
  //We can also use .isDisplayed method with a if/else statement
    
 /*   if (!driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/a/img")).isDisplayed()
)
    {
         System.out.println("Image not displayed.");
    }
    else
    {
        System.out.println("Image displayed.");
    }
*/
	
		return this;
	}
	

	
	
	/*public HomePagePhP Hotel_Search(){
	 * 
		WebElement location= driver.findElement(By.partialLinkText("Search by Hotel or City Name")).click();
		
		
		 return this;
	// 2-Test Scenario: Validate the login page
*/	
	

	/*
	public HomePagePhP Reserv_Details() throws InterruptedException{
		  driver.switchTo().frame(0);
			 WebElement Oneway = driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), 'One way')]"));	


	}
			 

	
*/
		/*WebElement flights = driver.findElement(By.xpath("//span[@class='hidden-xs' and contains(text(), 'Flights')]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click();", flights);
		Thread.sleep(2);
		//select 1 way
		  driver.switchTo().defaultContent();

		List<WebElement>radioButton = driver.findElements(By.id("trip-type-radio-group"));
		 System.out.println(radioButton.size());
	
		  action.moveToElement(Oneway).build().perform(); Oneway.click();

		// jse.executeScript("arguments[0].click();", Oneway);
			Thread.sleep(2);


		 boolean checkBoxState = Oneway.isSelected();
		if (isCheck == true) // user wanted to select the check-box
		{
			if (checkBoxState == true) // if box is checked by default
			{
				// do nothing
			} else // box is Not checked by default
			{
				Oneway.click();
			}
		} else { // user Do not want to select the check- box
			if (checkBoxState == true) {
				Oneway.click();
			} else {
				// Do nothing
			}
		}
		Thread.sleep(500);
		
		jse.executeScript("arguments[0].click();", Oneway);

		Oneway.click();
		
		boolean isToolTipDisplayed3 = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).isDisplayed();
		 System.out.println("Is Tooltip displayed ? : " + isToolTipDisplayed3);
		             if (isToolTipDisplayed3) {
		                 String tooltipText3 = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		 System.out.println("Tooltip Text 3:- " + tooltipText3);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOf(Oneway));
		
		WebElement origin= driver.findElement(By.xpath("//input[@placeholder='Enter departure city']"));
		
		//jse.executeScript("arguments[0].scrollIntoView()", origin);
*/
			//jse.executeScript("arguments[0].click();", origin);

		

		
		
	/*	WebElement myDynamicElement = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter departure city']")));
		
		Thread.sleep(2);

		origin.sendKeys("Atlanta");*/
	

		/*WebElement destination= driver.findElement(By.xpath("//input[@id='airports-inline-dest-d8399cbf-5e42-4be3-a0bd-864907f30e59']"));
		Thread.sleep(2);
		destination.sendKeys("Dulles");
		Thread.sleep(2);
		*/
		/*WebElement Passenger_DropD= driver.findElement(By.xpath("//div[@class='mewtwo-flights-trip_class-wrapper']"));
		Passenger_DropD.click();
		//List<web>Travelors= driver.findElements(By.xpath("//div[@class='mewtwo-passengers-ages']"));
*/		
		//return this;
	}


