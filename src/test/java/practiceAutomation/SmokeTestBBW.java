package practiceAutomation;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.custom.library.BasePage;

public class SmokeTestBBW  extends BasePage{
	
final static Logger logger = Logger.getLogger(BBWHomePage.class);
@Test
	public void goToBBWSite() throws Exception {
		
		driver.get("http://www.bathandbodyworks.com/");
		String Title = driver.getTitle();
		logger.info("go to - http://www.bathandbodyworks.com/");
		String expectedTitle = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
		assertEquals(Title, expectedTitle);	

	
	// hover over search body care

		WebElement bodyCare = driver.findElement(By.className("body-care"));
		myLib.moveMouseToElement(bodyCare);	
		myLib.customWait(2);
	
	// elem to click select "body scrub" or bodycare Type
		WebElement bodyScrub = driver.findElement(By.partialLinkText("Body Scrub"));		bodyScrub.click();

		
		//Synchronize the page load
		WebElement checkOutProgressElem = myLib.fluentWait(By.cssSelector("#primary > div.search-result-options.top > h1 > span"));
		Assert.assertNotNull(checkOutProgressElem);
		//select scrub name
		WebElement bodyScrubName = driver.findElement(By.cssSelector("#\39 ddada6c7fa1ad71a734bf8004 > div.product-outline-block > a > div.product-cont > div.product-name"));
		bodyScrubName.click();
		myLib.customWait(2);
		
		//add to chart
		
		WebElement chartButt = driver.findElement(By.cssSelector("#add-to-cart"));
		
		chartButt.click();
		
		
}
	
	


}
