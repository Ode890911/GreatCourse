package jQueryProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUiTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("http://jqueryui.com/droppable/"); // go to the web-site

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.partialLinkText("Droppable")).click();

		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));

		action.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(4000);
		//driver.close();
		driver.quit();

		
		
		driver.quit();
	}
}