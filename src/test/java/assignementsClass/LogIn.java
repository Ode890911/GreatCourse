package assignementsClass;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.custom.library.BasePage;
import com.custom.library.ExcelManager;

public class LogIn extends BasePage{

	@DataProvider(name = "Login")
	public static Object[][] credentials()
	{
		ExcelManager reader = new ExcelManager("src/test/resources/Username.xls");//create new object excelmanager ,excell file location must be added
		return reader.getExcelData("Sheet1");
	}
	@Test (dataProvider = "Login")//data provider annotation
	

	public void  NewEmailLog(String userName) throws Exception{
		
		driver.get("http://automationpractice.com/");
		driver.findElement(By.className("login")).click();		
		myLib.customWait(1);
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys(userName);		
		driver.findElement(By.id("SubmitCreate")).click();
		myLib.customWait(2);
		
		
	}


}
