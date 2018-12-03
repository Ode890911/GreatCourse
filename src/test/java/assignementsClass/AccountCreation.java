package assignementsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class AccountCreation extends BasePage{
	
	public AccountCreation waitUntilPageLoadComplete(){
		driver.findElement(By.className("page-heading"));
		
		return this;		

}
	
	public void  NewEmailLog() throws Exception{
		WebElement myEmail= driver.findElement(By.id("email_create"));
String uniquTimeStamp = myLib.getCurrentTimeStamp(); //timestamp
		
		myLib.enterTextField(myEmail, "aaron" + uniquTimeStamp + "@333.com");
		driver.findElement(By.id("SubmitCreate")).click();
		myLib.customWait(2);
		
		
	}

}
