package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class MintDropPage extends BasePage {
	public MintDropPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.className("in-stock-msg"));
		Assert.assertNotNull(elem);
		return this;
	}
	
	public MintDropPage addToChart()
	{
		WebElement chartButt = driver.findElement(By.cssSelector("#add-to-cart"));
		
		chartButt.click();
		return this;
	}

}
