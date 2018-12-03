package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class OrderPmtConfirm extends BasePage{
	public OrderPmtConfirm waitUntilPageLoadComplete() {

		myLib.waitUntilPageLoadComplete(By.className("page-subheading"));
		return this;
	}
	public OrderPmtConfirm Confirm_Order() throws Exception{
		
		driver.findElement(By.cssSelector("#cart_navigation > button")).click();
		myLib.customWait(1);
		return this;
		
	}
	

}
