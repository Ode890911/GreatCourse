package assignementsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.custom.library.BasePage;
import com.custom.library.ExcelManager;

public class Custo_Log_In extends BasePage{
	
	@FindBy(how=How.CLASS_NAME, using ="login") WebElement LoginBtn;
	@FindBy(id="email") WebElement userName;
	@FindBy(id="passwd") WebElement UserpassWord;
	@FindBy(id="SubmitLogin") WebElement Submit;
	
	@DataProvider(name = "Login")
	public static Object[][] credentials()
	{
		ExcelManager reader = new ExcelManager("src/test/resources/Username.xls");//create new object excelmanager ,excell file location must be added
		return reader.getExcelData("Sheet1");
	}
	@Test (dataProvider = "Login")//data provider annotation
	
	
	public void  NewEmailLog(String userId , String pass) throws Exception {
		driver.get("http://automationpractice.com/");
		myLib.customWait(1);
		LoginBtn.click();
		myLib.customWait(1);
		userName.sendKeys(userId);
		UserpassWord.sendKeys(pass);
		Submit.click();
	}
	
	
}
