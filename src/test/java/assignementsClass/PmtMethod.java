package assignementsClass;

import org.openqa.selenium.By;

import com.custom.library.BasePage;

public class PmtMethod extends BasePage {

	public PmtMethod waitUntilPageLoadComplete() {
		myLib.waitUntilPageLoadComplete(By.className("page-heading"));
		return this;
	}

	public PmtMethod Pmt_option() throws Exception {
		driver.findElement(By.className("bankwire")).click();
		myLib.customWait(1);
		return this;
	}
}
