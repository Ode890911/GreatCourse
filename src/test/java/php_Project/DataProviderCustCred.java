package php_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.custom.library.BasePage;
import com.custom.library.ExcelManager;

public class DataProviderCustCred extends BasePage {
	@DataProvider(name = "Sign Up")
	public static Object[][] credentials() {
		ExcelManager reader = new ExcelManager("src/test/resources/PhpUserCredTest.xls");// create
																							
		return reader.getExcelData("Sheet1");
	}

	@Test(dataProvider = "Sign Up") // data provider annotation
	public void loginTest(String First_Name, String Last_Name, String Mobile_Number, String Email, String Password,
			String confirm_Password) throws InterruptedException {
		driver.get("http://www.phptravels.net");
		Thread.sleep(1 * 1000);
		// Get Title of a WebPage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String sText = js.executeScript("return document.title;").toString();
		System.out.println("The website  title is  :" + sText);

		WebElement invisibleElem = driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
		js.executeScript("arguments[0].click();", invisibleElem);

		Thread.sleep(1 * 1000);

		WebElement invisibleElem2 = driver.findElement(By.xpath("//*[@id='li_myaccount']/ul/li[2]/a"));
		js.executeScript("arguments[0].click();", invisibleElem2);

		Thread.sleep(1 * 1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(First_Name);
		Thread.sleep(1 * 1000);

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Last_Name);
		
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Mobile_Number);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys(confirm_Password);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("button.signupbtn.btn_full.btn.btn-action.btn-block.btn-lg")).click();
		Thread.sleep(2 * 1000);

		driver.findElements(By.xpath("//div[@class='alert alert-danger']"));
		List<WebElement> text = driver.findElements(By.tagName("p"));
		if (driver.getTitle().contains("Register")) {
			for (int i = 0; i < text.size(); i++) {
				if (text.get(i).getText() != null) {
					// System.out.println(text.get(i).getText());
					String alert = text.get(i).getText();
					System.out.println(alert);
				}

			}
		}

		else {
			if (driver.getTitle().contains("Account")) {

				System.out.println("Page title verified. user is able to login successfully");
			}
		}

		Assert.assertTrue(driver.getTitle().contains("Account"), "user is not able to login-Invalid Credentiels");
		// System.out.println("Page title verified. user is able to login successfully");

	}

}

// Option 1: This is a good code

// List <WebElement> text = driver.findElements(By.xpath("//div[@class='alert
// alert-danger']"));

/*
 * for(int i=0; i< text.size(); i++) { if(text.get(i).getText() != null) {
 * System.out.println(text.get(i).getText()); } }
 */

// Option 2:
