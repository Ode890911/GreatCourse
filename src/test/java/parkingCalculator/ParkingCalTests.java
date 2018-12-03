package parkingCalculator;

import org.testng.annotations.Test;

import com.custom.library.BasePage;

public class ParkingCalTests extends BasePage {
	ParkingFees MyParkRef= new ParkingFees();

	
	@Test
	 public void ParkingInfo() throws Exception{
		MyParkRef.goto_AdamGoucherWebsite();
		MyParkRef.my_Park_Info();
		
		
	}
	
	

}
