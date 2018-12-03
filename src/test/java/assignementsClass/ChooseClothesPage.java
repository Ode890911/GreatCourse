package assignementsClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import com.custom.library.BasePage;

public class ChooseClothesPage extends BasePage {
	final static Logger logger = Logger.getLogger(ChooseClothesPage.class);
	public ChooseClothesPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.className("page-heading"));
		Assert.assertNotNull(elem);
		return this;
	}
	
	//4- user option 
	public ChooseClothesPage womenClothes() throws Exception{	
		//WebElement womenOptions = driver.findElement(By.partialLinkText("Dresses"));
		
		WebElement womenOptions = driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"));
		
		myLib.moveMouseToElement(womenOptions);
		myLib.fluentWait(By.partialLinkText("Evening Dresses"));
		driver.findElement(By.partialLinkText("Evening Dresses")).click();		
		
	return this;
	}

}	
	/*private void womenChoise (String categ, String clotheType) throws Exception {
		WebElement womenOptions = driver.findElement(By.partialLinkText("Dresses"));
		logger.info("txt: " + womenOptions.getText());		
		WebElement category = driver.findElement(By.id("block_top_menu"));
			myLib.moveMouseToElement(category);
			myLib.customWait(1);	
				
			
				//elem to click
				List<WebElement> womenOption= driver.findElements(By.tagName("a"));
				for (WebElement option : womenOption) {
					myLib.highlightElement(option);
					String txt = option.getText();
					if (txt.contains(clotheType)){
				WebElement subMenu = driver.findElement(By.partialLinkText("Evening Dresses"));		
				subMenu.click();
				break;
				}
	
				}
	}
	}*/
	/*
	////helpermethod
	private void click_prodName(String BodyCareNameText)
	{
		
		List<WebElement> products = driver.findElements(By.className("sf-with-ul"));
		
		for(WebElement bodyScrubOptions : products)
		{
			if(bodyScrubOptions.getText().contains(BodyCareNameText))
			{
				bodyScrubOptions.click();
				break;
			}
		}
	*/


