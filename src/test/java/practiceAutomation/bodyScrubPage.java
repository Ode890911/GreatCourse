package practiceAutomation;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class bodyScrubPage  extends BasePage{
	final static Logger logger = Logger.getLogger(bodyScrubPage.class);

	public bodyScrubPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.className("search-result-title"));
		Assert.assertNotNull(elem);
		return this;
	}
	//select product name and number;
	public bodyScrubPage selectAproduct (String BodyScrubName) throws Exception
	{
		click_prodName(BodyScrubName);
		logger.info("txt: " + BodyScrubName);
		myLib.customWait(5);
		return this;
	
}		
	private void click_prodName(String BodyCareNameText)
	{
		WebElement scrubList= driver.findElement(By.id("search-result-items"));
		List<WebElement> products = scrubList.findElements(By.className("product-name"));
		
		for(WebElement bodyScrubOptions : products)
		{
			if(bodyScrubOptions.getText().contains(BodyCareNameText))
			{
				bodyScrubOptions.click();
				break;
			}
		}
	

}
}
