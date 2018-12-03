package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class OrderSummaryPage extends BasePage{
	
	public OrderSummaryPage waitUntilPageLoadComplete(){
		myLib.waitUntilPageLoadComplete(By.id("cart_title"));
		return this;
	}
	public OrderSummaryPage proceedCheckout(){
		driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click();
		return this;
		
	}

}
