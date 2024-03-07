package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.CarInsurance;

public class TC2_CarInsurance extends Baseclass {
	CarInsurance car;
		@Test(priority = 11,groups={"smoke","regression"})
		public void homePage() throws InterruptedException {
			car= new CarInsurance(driver);
			car.NavigateBack();
			logger.info("***** Car Insurance *****");
			
		}
		@Test(priority = 12,groups={"smoke","regression"})
		public void carinsurancepage() throws InterruptedException, IOException {
			logger.info("Entering Car Insurance Details");
			car.clickMenu();
			car.clickCarInsurance();
			car.clickProceed();
		}
		@Test(priority = 13,groups={"regression"})
		public void cityandrto() throws InterruptedException, IOException {
			car.clickCityName();
			car.clickRTO();
			}
		@Test(priority = 14,groups={"regression"})
		public void carbrand() throws InterruptedException, IOException {
			car.clickCarBrand();
			car.clickCarModel();
			}
		@Test(priority = 15,groups={"regression"})
		public void varient() throws InterruptedException, IOException {
			car.clickFuelType();
			car.clickVarient();
			}
		@Test(priority = 16,groups={"regression"})
		public void gettingquotes() throws IOException, InterruptedException {
			car.EnterAnyName();
			car.CorrectEmail();
			car.mobinum();
			car.clickEnterButton();
			car.deliverydetails();
			car.showroomprice();
			car.submitbtn();
			car.firstquote();
			car.quotes();
		}
		@Test(priority = 17,groups={"regression"})
		public void errorMessage() throws IOException, InterruptedException {
			car.NavigateBack();
			car.clickMenu();
			car.clickCarInsurance();
			car.clickProceed();
			car.clickCityName();
			car.clickRTO();
			car.clickCarBrand();
			car.clickCarModel();
			car.clickFuelType();
			car.clickVarient();
			car.EnterAnyName();
			car.IncorrectEmail();
			car.clickEnterButton();
			car.PrintErrorMessage();
			logger.info("Error message Printed");
			logger.info("***** Car Insurance *****");
		}
		

	}