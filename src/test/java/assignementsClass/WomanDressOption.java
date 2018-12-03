package assignementsClass;

import org.openqa.selenium.By;


import com.custom.library.BasePage;

public class WomanDressOption extends BasePage {
	
	
	public WomanDressOption waitUntilPageLoadComplete(){
		
	myLib.waitUntilPageLoadComplete(By.className("title_block"));	
		return this;
	}
	
	//5 chosing evening dress
	
	public WomanDressOption eveningDress(){
		myLib.fluentWait(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a"));
		
		driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a")).click();
		
		return this;
	}

}
