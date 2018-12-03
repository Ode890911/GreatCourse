package assignementsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.custom.library.BasePage;
import com.custom.library.ExcelManager;

public class LogInPage_Fact extends BasePage{
	@DataProvider(name = "Login")
	public static Object[][] credentials()
	{
		ExcelManager reader = new ExcelManager("src/test/resources/Username.xls");//create new object excelmanager ,excell file location must be added
		return reader.getExcelData("Sheet1");
	}
	
	
	@FindBy(className="login") WebElement logBtn;
	@FindBy(id="email_create")WebElement userName;
	@FindBy(id="SubmitCreate") WebElement subBtn;
	
	
	@Test (dataProvider = "Login")//data provider annotation
public void  NewEmailLog(String userId) throws Exception{
		
		driver.get("http://automationpractice.com/");
		logBtn.click();		
		myLib.customWait(1);		
		userName.sendKeys(userId);		
		subBtn.click();
		myLib.customWait(2);
		
		
	}

	
}
