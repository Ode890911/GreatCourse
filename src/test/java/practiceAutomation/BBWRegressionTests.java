package practiceAutomation;


import org.testng.annotations.Test;


import com.custom.library.BasePage;

public class BBWRegressionTests extends BasePage {

	BBWHomePage MyBBWHome = new BBWHomePage();
	bodyScrubPage MyScrub= new bodyScrubPage();
	MintDropPage MyMintDrop = new MintDropPage();

	@Test(priority =1, enabled = true)	
	public void BuyBBWProduct() throws Exception {
		
		MyBBWHome.goToBBWSite();
		MyBBWHome.clickBodyCare();
		MyScrub.waitUntilPageLoadComplete();
		MyScrub.selectAproduct("Coconut Mint Drop");		
		MyMintDrop.waitUntilPageLoadComplete();
		MyMintDrop.addToChart();
	}

}
