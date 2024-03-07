package Regression;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import PageObject.CarInsurance;
import PageObject.HealthInsurance;
import PageObject.TravelInsurance;
import TestCases.Baseclass;
import Utilities.Datepickers;

public class RegressionTest extends Baseclass {
	TravelInsurance travel;
	CarInsurance car;
	HealthInsurance health;
	@Test(priority = 1)
	public void countrydetails() throws InterruptedException, IOException{
	
		logger.info("Starting Regression Testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		travel = new TravelInsurance(driver);
		travel.clickTravelInsurance();
		travel.clickCountry();
		travel.clickCountryName();
		travel.clickproceeddate();
		}
	@Test(priority = 2)
	public void tripdates() throws InterruptedException, IOException {
		travel.EnterStartDate(Datepickers.startdate());
	    travel.EnterEndDate(Datepickers.enddate());
		travel.clickproceedtravellers();
	}
	@Test(priority = 3)
	public void travellerage() throws InterruptedException, IOException {
		travel.clickTravellers();
		travel.clickTraveller1();
		travel.selectTraveller1Age();
		travel.clickTraveller2();
		travel.selectTraveller2Age();
		travel.clickproceedmedical();
	}
	@Test(priority = 4)
	public void medicaldetails() throws InterruptedException, IOException {
		travel.clickyes();	
		travel.selectTraveller1();
		travel.selectTraveller2();
		travel.selectfinalproceed();
		}
	@Test(priority = 5)
	public void Enteringphone() throws InterruptedException, IOException {
		travel.Enterphone();
		travel.clickviewplan();
		
	}
	@Test(priority = 6)
	public void plantype() throws InterruptedException, IOException {
		travel.selectStudentplan();
		
	}
	@Test(priority = 7)
	public void studentinfo() throws InterruptedException, IOException {
		travel.selectTraveller1CheckBox();
		travel.selectTraveller2CheckBox();
		
	}
	@Test(priority = 8)
	public void tripduration() throws InterruptedException, IOException {
		travel.selectTravelDuration();
		travel.clickApply();
		
	}
	@Test(priority = 9)
	public void addingfilter() throws InterruptedException, IOException {
		travel.sortFilter();
		travel.clickSortPrice();
		
	}
	@Test(priority = 10)
	public void InsurancePlans() throws InterruptedException, IOException {
		travel.printCompanyName();
		travel.printPrices();
		
	}
	@Test(priority = 11)
	public void homePage() throws InterruptedException {
		car= new CarInsurance(driver);
		car.NavigateBack();
		
	}
	@Test(priority = 12)
	public void carinsurancepage() throws InterruptedException, IOException {
		car.clickMenu();
		car.clickCarInsurance();
		car.clickProceed();
	}
	@Test(priority = 13)
	public void cityandrto() throws InterruptedException, IOException {
		car.clickCityName();
		car.clickRTO();
		}
	@Test(priority = 14)
	public void carbrand() throws InterruptedException, IOException {
		car.clickCarBrand();
		car.clickCarModel();
		}
	@Test(priority = 15)
	public void varient() throws InterruptedException, IOException {
		car.clickFuelType();
		car.clickVarient();
		}
	@Test(priority = 16)
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
	@Test(priority = 17)
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
	}
	@Test(priority = 18)
	public void navigateHomePage() throws InterruptedException {
		health=new HealthInsurance(driver);
		health.HomePage();
	}
	
	@Test(priority = 19)
	public void clickproduct() {
		health.insuranceproducts();
		}
	@Test(priority = 20)
	public void displayinsurancelist() throws IOException {
		health.healthInsuranceProducts();
		logger.info("Ending Regression Testing");
	}

	


}
