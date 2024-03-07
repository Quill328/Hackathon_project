package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.HealthInsurance;



public class TC3_HealthInsurance extends Baseclass{
	HealthInsurance health;
		@Test(priority = 18,groups={"smoke","regression"})
		public void navigateHomePage() throws InterruptedException {
			health=new HealthInsurance(driver);
			health.HomePage();
			logger.info("***** Health Insurance *****");
			
		}
		
		@Test(priority = 19,groups={"smoke","regression"})
		public void clickproduct() {
			health.insuranceproducts();
			}
		@Test(priority = 20,groups={"regression"})
		public void displayinsurancelist() throws IOException {
			logger.info("Capturing the list of Insurance Product Plans ");
			health.healthInsuranceProducts();
			logger.info("***** Health Insurance *****");
		}


}