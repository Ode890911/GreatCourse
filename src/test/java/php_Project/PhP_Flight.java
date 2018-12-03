package php_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class PhP_Flight extends BasePage {
	public PhP_Flight Flight_Reser() throws Exception {
		driver.get("http://www.phptravels.net");
		Thread.sleep(2 * 1000);
		// Get Title of a WebPage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String sText = js.executeScript("return document.title;").toString();
		System.out.println("The website  title is  :" + sText);

		// click on Flight Icon

		driver.findElement(By.xpath("//ul[@class='nav nav-tabs RTL nav-justified']/li[2]")).click();

		Thread.sleep(2000);
		driver.getTitle();
		Assert.assertTrue(driver.getTitle().contains("Flights"), "Flights Icons does not navigate to th enext section");
		System.out.println("Flights Icon verified.- User is able to navigate to the Flight section");

		// switch to default frame since "return" is selected by default
		WebElement travelstartIframe = driver
				.findElement(By.xpath("//iframe[@id='travelstartIframe-dd7d2f33-38c3-4c69-baac-56d16157023b']"));

		driver.switchTo().frame(travelstartIframe);
		Thread.sleep(2000);

		// select oneway option
		// List<WebElement> TripOption =
		// driver.findElements(By.xpath("//*[@id='trip-type-radio-group']"));
		driver.findElement(By.xpath("//*[@id='trip-type-radio-group']"));
		Thread.sleep(1 * 1000);
		driver.findElement(By.xpath("//*[@id='trip-type-radio-group']/label[1]")).click();

		Thread.sleep(1 * 1000);
		// select "return" option

		driver.findElement(By.xpath("//*[@id='trip-type-radio-group']/label[2]")).click();
		Thread.sleep(1 * 1000);
		
		// select MultiCity option
		driver.findElement(By.xpath("//*[@id='trip-type-radio-group']/label[3]")).click();
		Thread.sleep(1 * 1000);

		return this;
	}

}
