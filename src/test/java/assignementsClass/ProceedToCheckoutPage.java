package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class ProceedToCheckoutPage extends BasePage {
	
	public ProceedToCheckoutPage waitUntilPageLoadComplete(){
		myLib.waitUntilPageLoadComplete(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));
		
		return this;
	}
	
	public ProceedToCheckoutPage proceedCheckBtn() throws Exception{
		driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")).click();
		myLib.customWait(1);
		return this;
	}

}
