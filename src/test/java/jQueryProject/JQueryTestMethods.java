package jQueryProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryTestMethods {

	WebDriver driver;
	Actions action = new Actions(driver);


	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void tearDown() throws InterruptedException {
		Thread.sleep(5 *1000);
		driver.close();
		driver.quit();

	}

	

	@Test(priority = 1, enabled = true)
	public void Go_ToJQueryWebsite() throws Exception {
		driver.get("http://jqueryui.com/"); // go to the web-site
		String websiteTitle = driver.getTitle();
		System.out.println("This website's title is: " + websiteTitle);
		String expectedWebsiteTitle = "jQuery UI";
		Assert.assertEquals(websiteTitle, expectedWebsiteTitle);
		Thread.sleep(2* 1000); // stops the test for 5 seconds
	
	}
		// --------------Interactions
	

		public void DraggableAction() throws InterruptedException{	
		Actions action = new Actions(driver);

		  driver.findElement(By.partialLinkText("Draggable")).click();
		  driver.switchTo().frame(0); 
		  WebElement Drag_only = driver.findElement(By.id("draggable"));
		  action.clickAndHold(Drag_only).moveByOffset(326,
		  77).build().perform(); 
		  Thread.sleep(2*1000);
		  driver.switchTo().defaultContent();
		 }
	  
		
  
		  public void Droppable() throws InterruptedException{		  
		
		  driver.findElement(By.partialLinkText("Droppable")).click();		  
		  driver.switchTo().frame(0); 
		  WebElement Drag = driver.findElement(By.id("draggable")); 
		  WebElement Drop= driver.findElement(By.id("droppable"));		  
		  action.dragAndDrop(Drag, Drop).perform(); 
		  Thread.sleep(2*1000);
		  driver.switchTo().defaultContent();
	  }

		
		  //3. Resizable
		 public void Resizable() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Resizable")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0); 
		  WebElement Resize = driver.findElement(By.id("resizable"));		  
		  action.clickAndHold(Resize).moveByOffset(520,60).release(Resize).build().perform();		  
		  Thread.sleep(2000); 
		  driver.switchTo().defaultContent();
		 }
		  //4. Selectable
		 
		 public void Selectable() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Selectable")).click();
		  driver.switchTo().frame(0); 
		  Thread.sleep(1*1000); 
		  WebElement Select = driver.findElement(By.id("selectable")); 
		  List<WebElement>ItemSelect = Select.findElements(By.tagName("li")); 
		  ItemSelect.get(2).click();
		  Thread.sleep(2*1000); 
		  driver.switchTo().defaultContent();

		 }

		// 5. Sortable
		 
		 public void Sortable() throws InterruptedException{
		
		  driver.findElement(By.partialLinkText("Sortable")).click();
		  driver.switchTo().frame(0);
		  Thread.sleep(1*1000); 
		  WebElement Sort = driver.findElement(By.id("sortable"));
		  List<WebElement>ItemSort = Sort.findElements(By.tagName("li"));
		  WebElement Item1= ItemSort.get(4); 
		  WebElement Item2= ItemSort.get(0);
		  action.dragAndDrop(Item1, Item2).perform();		  
		  Thread.sleep(2*1000); 
		  driver.switchTo().defaultContent();
		// }
	}
		// Widgets------------------------
		// 1. Accordion
		public void Accordion() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Accordion")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		  List<WebElement>AccSection = driver.findElements(By.tagName("h3"));
		  for(WebElement Section:AccSection){
		  action.click(Section).build().perform();
		  Thread.sleep(3000); 
		  driver.switchTo().defaultContent();
		  
		  }
		  
		  } 
		 

		// 2. Autocomplete
		public void Autocomplete() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Autocomplete")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		  String textTo_Select= "AppleScript";
		  driver.findElement(By.id("tags")).sendKeys("a");
		  Thread.sleep(1*000); 
		  List<WebElement>SuggestList = driver.findElements(By.tagName("li")); 
		  for(WebElement Suggestion: SuggestList){ 
			  if(Suggestion.getText().equals(textTo_Select)) 
			  {
		  System.out.println("Trying to select: "+textTo_Select);
		  Suggestion.click(); break; } 
			  }
		  
		  }
		
		 

		// 4. Checkboxradio
		public void Checkboxradio() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Checkboxradio")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		}

		// 3. Button
		public void Button() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Button")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0); 
		  WebElement Button = driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));
		  
		  action.moveToElement(Button).build().perform(); Button.click();
		  Thread.sleep(2000); 
		  driver.switchTo().defaultContent();
		 
		}
		// 5. Controlgroup
		public void ControlGroup() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Controlgroup")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		  driver.findElement(By.xpath("//div[@class='controlgroup ui-controlgroup ui-controlgroup-horizontal ui-helper-clearfix']"));
		  driver.findElement(By.xpath("//span[@id='car-type-button']")).click(); 
		  Thread.sleep(1*1000);
		  driver.findElement(By.xpath("//div[@id='ui-id-6']")).click();		  
		  Thread.sleep(1*1000);
		 
		  WebElement insuranceRadio= driver.findElement(By.xpath("//label[@for='insurance']"));
		  insuranceRadio.click(); 
		  Thread.sleep(1*1000); 
		  WebElement Transmission_Stand= driver.findElement(By.xpath("//label[@for='transmission-standard']")); 
		  Transmission_Stand.click(); 
		  Thread.sleep(1*1000); 
		  WebElement Transmission_auto= driver.findElement(By.xpath("//label[@for='transmission-automatic']")); 
		  Transmission_auto.click(); 
		  Thread.sleep(1*1000);		  
		  
		  WebElement Num_Of_Car = driver.findElement(By.xpath("//input[@id='horizontal-spinner']"));
		  Num_Of_Car.sendKeys("5"); 
		  Thread.sleep(1*1000);
		  driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")).click();
		  Thread.sleep(1*1000);
		  
		  driver.switchTo().defaultContent();
		}

		// 6. Datepicker
		public void DatePicker() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Datepicker")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		  driver.findElement(By.id("datepicker")).click();
		  //((JavascriptExecutor)driver).executeScript("document.getElementById('datepicker').value='01/31/2018'"); 
		//  String datechosen ="01/31/2018";	  
		  
		  WebElement datechosen= driver.findElement(By.tagName("a"));
		  datechosen.sendKeys("01/30/2018");
		  driver.switchTo().defaultContent();

		}
		// 7. Dialog
		public void Dialog() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Dialog")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		   //drag 
		  WebElement dragDialog= driver.findElement(By.xpath("//span[@id='ui-id-1']"));
		  action.clickAndHold(dragDialog).moveByOffset(20, 40).build().perform();
		  
		  //resize 
		  WebElement dialogResize = driver.findElement(By.id("dialog"));
		  action.clickAndHold(dialogResize).moveByOffset(300, 90).release(dialogResize).build().perform(); 
		  Thread.sleep(2000);
		  //close dialog 
		  WebElement closeBtn = driver.findElement(By.xpath("//button[@type='button']"));
		  closeBtn.click(); 
		  driver.switchTo().defaultContent();
		 
		}
		// 8. Menu
		public void Menu() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Menu")).click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().frame(0);
		  
		  WebElement Menu = driver.findElement(By.xpath("//div[@id='ui-id-4']"));
		  action.moveToElement(Menu).build().perform(); 
		  Thread.sleep(1*1000);
		  WebElement subMenu = driver.findElement(By.xpath("//div[@id='ui-id-6']"));
		  action.moveToElement(subMenu).perform(); 
		  subMenu.click();
		  Thread.sleep(1*1000); 
		  driver.switchTo().defaultContent();
		 
		}
		// 9. Select menu
		public void SelectMenu() throws InterruptedException{
		driver.findElement(By.partialLinkText("Selectmenu")).click();
		Thread.sleep(1 *1000);
		driver.switchTo().frame(0);

		// select a speed
		driver.findElement(By.xpath("//span[@id='speed-button']")).click();
		// select option fast
		driver.findElement(By.xpath("//div[@id='ui-id-4']")).click();
		Thread.sleep(1* 1000);

		// select a file
		driver.findElement(By.xpath("//span[@id='files-button']")).click();
		// select option ui.jQuery.js
		driver.findElement(By.xpath("//[@id='files-menu']/li[3]")).click();
		Thread.sleep(1* 1000);

		// select a number
		driver.findElement(By.xpath("//span[@id='number-button']")).click();
		// select option "9"
		driver.findElement(By.xpath("//[@id='number-menu']/li[9]")).click();
		Thread.sleep(1 *1000);

		// select a title
		driver.findElement(By.xpath("//[@id='salutation-button']")).click();
		// select option "Mrs"
		WebElement myDynamicElement = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//[@id='salutation-menu']/li[3]")));
		myDynamicElement.click();
		Thread.sleep(1* 1000);

		driver.switchTo().defaultContent();

		}
		 // 10. Slider
		public void Slider() throws InterruptedException{
		  driver.findElement(By.partialLinkText("Slider")).click();
		 Thread.sleep(1*1000);
		 driver.switchTo().frame(0);
		 WebElement slider= driver.findElement(By.xpath("//[@id='slider']"));				
		 action.clickAndHold(slider).moveByOffset(45, 0).release(slider).perform();
		 Thread.sleep(2*1000);
		  driver.switchTo().defaultContent();

		}
		 //11. Tabs
		public void Tabs() throws InterruptedException{
		driver.findElement(By.partialLinkText("Tabs")).click();
		 Thread.sleep(1*1000);
		 driver.switchTo().frame(0);
		 driver.findElement(By.cssSelector("#ui-id-2")).click();
		 Thread.sleep(1*1000);
		 driver.findElement(By.xpath("//[@id='ui-id-3']")).click();
		 Thread.sleep(1*1000);
		  driver.switchTo().defaultContent();

		}
		
		 //12. Tooltip
		public void toolTip() throws InterruptedException {
		driver.findElement(By.partialLinkText("Tooltip")).click();
		Thread.sleep(1 * 1000);
		driver.switchTo().frame(0);

		// toolpit1
		String expectedToolTip1 = "That's what this widget is";
		WebElement toolpit_1 = driver.findElement(By.xpath("//a[@href='#']"));
		// Using actions class to do mouse hover
		action.moveToElement(toolpit_1).build().perform();
		WebElement toolTipElement = driver.findElement(By.xpath("//div[contains(text(),'widget')]"));

		// get the tooltip text
		String ActualTooltip1 = toolTipElement.getText();
		System.out.println("actual tooltip 1 is " + ActualTooltip1);
		// Using assert to verify the expected and actual value
		Assert.assertEquals("That's what this widget is", ActualTooltip1);

		if (ActualTooltip1.equals(expectedToolTip1)) {
			System.out.println("Test 1 Case Passed");
		}

		Thread.sleep(2 * 1000);

		// toolpit 2

		String expectedToolTip2 = "ThemeRoller: jQuery UI's theme builder application";
		WebElement toolpit_2 = driver.findElement(By.cssSelector("body > p:nth-child(2) > a"));
		// Using actions class to do mouse hover
		action.moveToElement(toolpit_2).build().perform();
		WebElement toolTipElement1 = driver.findElement(By.xpath("//div[contains(text(),'builder')]"));
		// get the tooltip text
		String ActualTooltip2 = toolTipElement1.getText();
		System.out.println("actual tooltip 2 is " + ActualTooltip2);
		// Using assert to verify the expected and actual value
		Assert.assertEquals(expectedToolTip2, ActualTooltip2);

		if (ActualTooltip2.equals(expectedToolTip2)) {
			System.out.println("Test 2 Case Passed");
		}
		Thread.sleep(2 * 1000);

		// toolpit 3
		String expectedToolTip = "We ask for your age only for statistical purposes.";
		WebElement toolTipEle = driver.findElement(By.xpath("//input[@id='age']"));
		// Using actions class to do mouse hover
		action.moveToElement(toolTipEle).build().perform();

		WebElement toolTipElement11 = driver.findElement(By.xpath("//div[contains(text(),'statistical')]"));
		// get the tooltip text
		String ActualtoolTipTxt = toolTipElement11.getText();
		System.out.println("actual tooltip 3 is " + ActualtoolTipTxt);
		// Using assert to verify the expected and actual value
		Assert.assertEquals("We ask for your age only for statistical purposes.", ActualtoolTipTxt);
		if (ActualtoolTipTxt.equals(expectedToolTip)) {
			System.out.println("Test 3 Case Passed");
		}
		Thread.sleep(2 * 1000);
		  driver.switchTo().defaultContent();


	}
		  
		  
		  
			/* boolean isToolTipDisplayed3 = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).isDisplayed();
		 System.out.println("Is Tooltip displayed ? : " + isToolTipDisplayed3);
		             if (isToolTipDisplayed3) {
		                 String tooltipText3 = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		 System.out.println("Tooltip Text 3:- " + tooltipText3);
		 }
		*/

	

}