package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class Confirm_my_order extends BasePage {
	
	public Confirm_my_order waitUntilPageLoadComplete() {

		myLib.waitUntilPageLoadComplete(By.className("page-subheading"));
		return this;
	}
	public Confirm_my_order Confirm_Order() throws Exception{
		
		driver.findElement(By.className("#cart_navigation > button")).click();
		myLib.customWait(1);
		
		return this;
	}
	

}
