package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class MyAdressesPage extends BasePage {
	public MyAdressesPage waitUntilPageLoadComplete(){
		driver.findElement(By.className("page-heading"));
		
		return this;
	}
	/*public MyAdressesPage NewAdress(){
	driver.findElement(By.cssSelector("#center_column > div > a")).click();
	
	}*/
	public MyAdressesPage My_Billing() throws Exception{
		myLib.handleCheckBox(By.id("uniform-addressesAreEquals"), true);
		return this;

	}
	public MyAdressesPage Proceed_to_Check() throws Exception{
		driver.findElement(By.cssSelector("#center_column > form > p > button")).click();
		myLib.customWait(1);
		return this;
	}

}
