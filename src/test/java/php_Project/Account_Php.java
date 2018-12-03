package php_Project;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class Account_Php extends BasePage{
	
	public Account_Php waitUntilPageLoadComplete(){
		driver.findElement(By.className("page-heading"));
		
		return this;
	
	//li[@id='li_myaccount']

}
}


