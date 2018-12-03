package assignementsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.custom.library.BasePage;

public class AutoPractLogInPage extends BasePage{
	
	
	public AutoPractLogInPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.className("page-heading"));
		Assert.assertNotNull(elem);
		return this;
		
	}
	
	
	// 3- Enter a valid username and password
	public AutoPractLogInPage enterValidCred() throws Exception{
			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("aaronmeg@yahoo.fr");
			
			// 3- Enter a valid  password
	
			WebElement passWord = driver.findElement(By.id("passwd"));
			passWord.sendKeys("today");
			WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
			submitLogin.click();
			myLib.customWait(2);
			return this;
	}
}
			
		


