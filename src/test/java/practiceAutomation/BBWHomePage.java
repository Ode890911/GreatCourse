package practiceAutomation;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.custom.library.BasePage;

public class BBWHomePage extends BasePage {
	final static Logger logger = Logger.getLogger(BBWHomePage.class);



	
	public void goToBBWSite() throws Exception {

		driver.get("http://www.bathandbodyworks.com/");
		String Title = driver.getTitle();
		logger.info("go to - http://www.bathandbodyworks.com/");
		String expectedTitle = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
		assertEquals(Title, expectedTitle);
	
	}
	
	// hover over search body care
	public BBWHomePage clickBodyCare() throws Exception {
		WebElement bodyCare = driver.findElement(By.className("body-care"));
		myLib.moveMouseToElement(bodyCare);	
		myLib.customWait(2);
	
	// elem to click select "body scrub" or bodycare Type
		WebElement bodyScrub = driver.findElement(By.partialLinkText("Body Scrub"));
		bodyScrub.click();
		return this;
		
}
	
	/*public BBWHomePage selectAproduct (String BodyScrubName)
	{
		click_prodName(BodyScrubName);
		return this;
	
}	


	private void click_prodName(String BodyCareNameText)
	{
		List<WebElement> products = driver.findElements(By.className("product-tile-link"));
		for(WebElement bodyScrubOptions : products)
		{
			if(bodyScrubOptions.getText().contains(BodyCareNameText))
			{
				bodyScrubOptions.click();
				break;
			}
		}

	}*/

}