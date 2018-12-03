package crossBrowser;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BBWPresenTest  {
	
	WebDriver driver;
	
	@ BeforeTest
	@Parameters("browser")	
	public void SetUp (String browserName) throws Exception {
		
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");

			driver= new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");

			driver= new InternetExplorerDriver();

			
		}
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver= new ChromeDriver();

		}
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		@Test
		public void BBWWebsite(){

		driver.get("http://www.tiffany.com/");
		String Title = driver.getTitle();
		String expectedTitle = "Tiffany & Co. Official | Luxury Jewelry, Gifts & Accessories Since 1837";
		assertEquals(Title, expectedTitle);
		driver.close();
		driver.quit();
		}
	

}

