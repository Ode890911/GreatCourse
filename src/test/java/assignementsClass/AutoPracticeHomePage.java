package assignementsClass;



import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class AutoPracticeHomePage extends BasePage {
	final static Logger logger = Logger.getLogger(AutoPracticeHomePage.class);
	// 1- Scenario- launch the website
	

	public AutoPracticeHomePage goto_automationpracticeWebsite() {
		driver.get("http://automationpractice.com/");
		String websiteTitle = driver.getTitle();
		System.out.println("the website title is :" + websiteTitle);
		String expectedTitle = ("My Store");
		assertEquals(websiteTitle, expectedTitle);

		return this;
	}

	// 2-Test Scenario: Validate the login page

	public AutoPracticeHomePage clickSignIn() throws Exception {			

		WebElement loginBtn = driver.findElement(By.className("login"));
		loginBtn.click();
		myLib.customWait(2);
		return this;
	}
		

}
