package php_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class VerifyCurrency extends BasePage{

	
	public VerifyCurrency  CurrencyDropDown() throws InterruptedException{
		driver.get("http://www.phptravels.net");
		Thread.sleep(1*1000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		WebElement Defaultcurrency= driver.findElement(By.cssSelector("body > div.tbar-top.hidden-sm.hidden-xs > div > div > div.col-md-6.col-sm-8.col-xs-5.go-left > ul > li.dropdown > a"));
		String curr= Defaultcurrency.getText();
		System.out.println("default currency is : " + curr);
	
		WebElement invisibleElem = driver.findElement(By.xpath("//ul[@class='dropdown-menu wow fadeIn animated']"));			
		js.executeScript("arguments[0].click();", invisibleElem);
		
		Thread.sleep(1*1000);
		
		
		
		WebElement invisibleElem1 = driver.findElement(By.xpath("//a[@class='go-text-right' and contains(text(), 'USD')]"));			
		js.executeScript("arguments[0].click();", invisibleElem1);
		
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());
		
		WebElement currencySelected= driver.findElement(By.cssSelector("body > div.tbar-top.hidden-sm.hidden-xs > div > div > div.col-md-6.col-sm-8.col-xs-5.go-left > ul > li.dropdown > a"));
		js.executeScript("arguments[0].click();", currencySelected);

		String text= currencySelected.getText();
	
		System.out.println(" currency selected is :" + text);
		Assert.assertTrue(text.contains("USD"), "currency not updated");
		System.out.println("currency updated successfully");

		return this;	
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	WebElement invisibleElem = driver.findElement(By.xpath("//ul[@class='dropdown-menu wow fadeIn animated']"));			
	js.executeScript("arguments[0].click();", invisibleElem);

	Thread.sleep(2*1000);

	List<WebElement> currency = driver.findElements(By.xpath("//a[@class='go-text-right' and @onclick='change_currency(this)']"));

//js.executeScript("arguments[0].click();", currency);

	Thread.sleep(2*1000);
	
	
	
	
	for(WebElement option: currency){
		System.out.println("the currency is : " + option.getText());
	}	
		*///driver.findElement(By.xpath("//a[@class='go-text-right' and contains(text(), 'EUR')]"));
		/*int totalCurrency = currencyDrop.size();
		System.out.println("the number of currencies is:" + totalCurrency);
		
		for(WebElement currency:currencyDrop){
			boolean visibility = currency.isDisplayed();
		if (visibility == true) {
			String linkText = "";
			linkText = currency.getText();
			System.out.println(linkText);
			
		}else {
			
			System.out.println("element not visible");
		}
				
		
	
	}*/
		
	
	
