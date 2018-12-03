package assignementsClass;

import org.testng.annotations.Test;

import com.custom.library.BasePage;

public class AssigRegressionTest extends BasePage {
	
	AutoPracticeHomePage myAPHomePage = new AutoPracticeHomePage();
	//LogIn NewLog= new LogIn();
	/*AccountCreation MyAccount= new AccountCreation();
	PersoInfoPage MyPerInfo= new PersoInfoPage();*/
	AutoPractLogInPage MyLogIn= new AutoPractLogInPage();// use it for returning customer
	ChooseClothesPage MyClothes= new ChooseClothesPage();
	WomanDressOption MyEvenDress = new WomanDressOption();
	CheckOut MyChOut= new CheckOut();
	ProceedToCheckoutPage myChOutBtn = new ProceedToCheckoutPage();
	OrderSummaryPage MyOrder= new OrderSummaryPage();	
	MyAdressesPage MyPrefAddr= new MyAdressesPage();
	ShippingPage MyShipp = new ShippingPage();
	PmtMethod MyPmtInfo= new PmtMethod();
	OrderPmtConfirm MyConfirm = new OrderPmtConfirm();
	
	
	@Test 
	public void BuyClothes() throws Exception{
	myAPHomePage.goto_automationpracticeWebsite();
	myAPHomePage.clickSignIn();
	//NewLog.waitUntilPageLoadComplete();
	//NewLog.NewEmailLog(userName);;
	
	/*MyAccount.waitUntilPageLoadComplete();
	MyAccount.NewEmailLog();
	MyPerInfo.waitUntilPageLoadComplete();
	MyPerInfo.CustomerInfo();
	MyPerInfo.AdressInfo();	*/
	
	MyLogIn.waitUntilPageLoadComplete(); //returning customers
	MyLogIn.enterValidCred();
	MyClothes.waitUntilPageLoadComplete();
	MyClothes.womenClothes();
	MyEvenDress.waitUntilPageLoadComplete();
	MyEvenDress.eveningDress();
	MyChOut.waitUntilPageLoadComplete();
	MyChOut.orderDetails();
	MyChOut.select_A_DressColor();
	MyChOut.select_Quantity("1");
	MyChOut.add_To_Chart();
	myChOutBtn.waitUntilPageLoadComplete();
	myChOutBtn.proceedCheckBtn();
	MyOrder.waitUntilPageLoadComplete();
	MyOrder.proceedCheckout();
	
	MyPrefAddr.waitUntilPageLoadComplete();
	MyPrefAddr.My_Billing();
	MyPrefAddr.Proceed_to_Check();
	MyShipp.waitUntilPageLoadComplete();
	MyShipp.Select_Ship_Option();
//	MyShipp.proceedToCheck();
//	MyShipp.TermofServ_window();
	MyShipp.term_Of_Serv();
	MyShipp.proceedToCheck();
	MyPmtInfo.waitUntilPageLoadComplete();
	MyPmtInfo.Pmt_option();
	MyConfirm.waitUntilPageLoadComplete();
	MyConfirm.Confirm_Order();
	
	
			
	}
}
