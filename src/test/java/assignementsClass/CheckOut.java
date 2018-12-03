package assignementsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class CheckOut extends BasePage {
	public CheckOut waitUntilPageLoadComplete() {

		myLib.waitUntilPageLoadComplete(By.className("page-product-heading"));
		return this;
	}
	
	
	//8-quantity wanted
		public  CheckOut select_Quantity (String quantityWanted) throws Exception{
			quantyWanted(quantityWanted);
			
			return this;
		}
		
//6- select dress size
	public CheckOut orderDetails() throws Exception {

		myLib.selectDropDown(By.id("group_1"), "M");
		myLib.customWait(2);
		return this;
	}
//7chosing dress color
	public CheckOut select_A_DressColor() throws Exception {
		//WebElement dressColor = 
				driver.findElement(By.className("attribute_fieldset"));
		//WebElement colorChoice =
				//myLib.highlightElement(By.id("color_24"));
				driver.findElement(By.id("color_24")).click();
				
		myLib.customWait(2);
		return this;
	}
	// 8-add to char button
	public CheckOut add_To_Chart() throws Exception{
		//myLib.highlightElement(By.id("add_to_cart"));
		driver.findElement(By.id("add_to_cart")).click();
		myLib.customWait(2);
		return this;
	}

	
	

	
	
	
	private void quantyWanted(String quantSelec) throws Exception{
		WebElement quantityChoosen = driver.findElement(By.id("quantity_wanted_p"));
		List<WebElement> Icons = quantityChoosen.findElements(By.tagName("a"));
		WebElement plusIcon=Icons.get(1);	
			
			int dressNum = Integer.parseInt(quantSelec);
			for (int i = 1; i <= dressNum; i++) {
				plusIcon.click();
				myLib.customWait(0.5);
			
			}
			}
	
	
	//////////////// helper method section //////////////////////
	/*private void click_Course(String dressColorText) {
		WebElement dressColor = driver.findElement(By.className("attribute_fieldset"));
		WebElement colorChoice =driver.findElement(By.id("color_24"));
		List<WebElement> colorChoice = dressColor.findElements(By.tagName("a"));
		for (WebElement options : colorChoice) {
			if (options.getText().contains(dressColorText)) {
				options.click();
				break;
			}
		}*/
	

}
