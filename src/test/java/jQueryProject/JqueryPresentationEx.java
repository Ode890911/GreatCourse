package jQueryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.custom.library.BasePage;

public class JqueryPresentationEx extends BasePage { 
	
	@Test(priority = 1, enabled = true)
	public void JQueryUi_Interactions() throws Exception {
		driver.get("http://jqueryui.com/"); // go to the web-site
		String websiteTitle = driver.getTitle();
		System.out.println("This website's title is: " + websiteTitle);
		String expectedWebsiteTitle = "jQuery UI";
		Assert.assertEquals(websiteTitle, expectedWebsiteTitle);
		Thread.sleep(2* 1000);
	
//	9. Select menu//WebDriverWait example
	//public void SelectMenu() throws InterruptedException{
	driver.findElement(By.partialLinkText("Selectmenu")).click();
	Thread.sleep(1 *1000);
	driver.switchTo().frame(0);

	// select a speed
	driver.findElement(By.xpath("//span[@id='speed-button']")).click();
	// select option fast
	driver.findElement(By.xpath("//div[@id='ui-id-4']")).click();
	Thread.sleep(1* 1000);

	// select a file
	driver.findElement(By.xpath("//span[@id='files-button']")).click();
	// select option ui.jQuery.js
	driver.findElement(By.xpath("//*[@id='files-menu']/li[3]")).click();
	Thread.sleep(1* 1000);
	
	// select a number
	driver.findElement(By.xpath("//span[@id='number-button']")).click();
	// select option "9"
	driver.findElement(By.xpath("//*[@id='number-menu']/li[9]")).click();
	Thread.sleep(1 *1000);

	// select a title
	driver.findElement(By.xpath("//*[@id='salutation-button']")).click();
	// select option "Mrs"
	WebElement myDynamicElement = (new WebDriverWait(driver, 60))
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='salutation-menu']/li[3]")));
	myDynamicElement.click();
	Thread.sleep(1* 1000);

	driver.switchTo().defaultContent();

	}
}
