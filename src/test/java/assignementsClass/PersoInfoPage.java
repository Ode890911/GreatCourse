package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class PersoInfoPage extends BasePage{
	
	public PersoInfoPage waitUntilPageLoadComplete(){
		driver.findElement(By.className("page-heading"));
		
		return this;
	}
	
	
	
	
	public PersoInfoPage CustomerInfo() throws Exception{
		
		myLib.enterTextField(By.id("customer_firstname"), "aaron");
		myLib.enterTextField(By.id("customer_lastname"), "meg");
		myLib.enterTextField(By.id("passwd"), "today");
		return this;
		}
	public PersoInfoPage AdressInfo() throws Exception{
		myLib.enterTextField(By.id("address1"), "123 Moossou");
		myLib.enterTextField(By.id("city"), "Moossou");
		myLib.selectDropDown(By.id("id_state"), "Virginia");
		myLib.enterTextField(By.id("postcode"), "01972");
		myLib.enterTextField(By.id("phone"), "0001972");
		
		myLib.enterTextField(By.id("alias"), "Primary Adress");
		driver.findElement(By.id("submitAccount")).click();
		myLib.customWait(2);
	return this;	
	
	}
	
}
