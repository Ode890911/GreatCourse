package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class ShippingPage extends BasePage {
	
	public ShippingPage waitUntilPageLoadComplete(){
		driver.findElement(By.className("page-heading"));
		
		return this;		

}
	
	public  ShippingPage Select_Ship_Option () throws Exception {
		myLib.handleCheckBox(By.className("radio"), true);	
	
		return this;
		
}
	
	
/*	public ShippingPage TermofServ_window(){
		myLib.fluentWait(By.className("fancybox-item.fancybox-close"));
		driver.findElement(By.className("fancybox-item.fancybox-close")).click();
		//myLib.switchToIframe(By.className("fancybox-item.fancybox-close"));
		//myLib.switchToDefault();
		return this;
	}*/
	
	
	public  ShippingPage term_Of_Serv () throws Exception {
	myLib.handleCheckBox(By.id("cgv"), true);
	myLib.customWait(1);

	return this;

}
	public ShippingPage proceedToCheck() throws Exception{
		driver.findElement(By.cssSelector("#form > p > button")).click();
		myLib.customWait(2);
		return this;
	}
}