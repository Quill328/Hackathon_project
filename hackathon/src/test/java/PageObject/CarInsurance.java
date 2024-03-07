package PageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.Excel;

public class CarInsurance extends BasePage {
	JavascriptExecutor js;
	public CarInsurance(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor)driver;
	}
	@FindBy(xpath="//i[@class='arrow']") 
	WebElement arrow;
	@FindBy(xpath="//a[text()='Car Insurance']") 
	WebElement carInsurance;
	@FindBy(xpath="//span[text()='car? Click here']") 
	WebElement newCar;
	@FindBy(xpath="//*[@id='pre-quote']/div[2]/div[3]/div[2]/div[2]/div[3]/div[1]") 
	WebElement city;
	@FindBy(xpath="//label[@data-id='481']") 
	WebElement rto;
	@FindBy(xpath="//label[@data-id='33']") 
	WebElement brand;
	@FindBy(xpath="//label[@data-id='222']") 
	WebElement model;
	@FindBy(xpath="//span[text()='Petrol']") 
	WebElement fuel;
	@FindBy(xpath="//span[text()='Delta AMT'][@class='text']") 
	WebElement variant;
	//@FindBy(xpath="//input[@id ='txtName']")
	@FindBy(id="txtName")
	WebElement name;
	@FindBy(xpath="//input[@id ='txtEmail']") 
	WebElement errorEmail;
	@FindBy(xpath="//input[@id ='mobNumber']")
	WebElement mobilenumber;
	@FindBy(xpath="//span[@class='icon']")
	WebElement viewprices;
	@FindBy(xpath="//div[text()='Please enter valid email address']") 
	WebElement errorNo;
	@FindBy(xpath="(//*[@class='radioBox bgWhite'])[2]")
	WebElement sevendays;
	@FindBy(xpath="//*[@name='exShowRoomPrice']")
	WebElement exshowroomprice;
	@FindBy(xpath="//*[text()='Submit']")
	WebElement submitbtn;
	@FindBy(xpath="//*[@class='primaryBtnV2 fillingEffect']")
	WebElement insurance;
	@FindBy(name="summaryFormPF")
	WebElement quote;
	
	
	public void NavigateBack() throws InterruptedException{
		driver.navigate().to("https://www.policybazaar.com/");
		Thread.sleep(1000);
		}
	public void clickMenu() {
		
		js.executeScript("arguments[0].click()",arrow);
		}
	public void clickCarInsurance() throws InterruptedException
	{
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", carInsurance);
	}
	public void clickProceed() throws InterruptedException
	{
		newCar.click();
		Thread.sleep(2000);
	}
	public void clickCityName() throws InterruptedException
	{
		
		js.executeScript("arguments[0].click()", city);
		Thread.sleep(2000);
	}
	public void clickRTO() throws InterruptedException
	{
		rto.click();
		 Thread.sleep(2000);
	}
	public void clickCarBrand() throws InterruptedException
	{
		brand.click();
		 Thread.sleep(2000);
	}
	public void clickCarModel() throws InterruptedException
	{
		model.click();
		 Thread.sleep(2000);
	}
	public void clickFuelType() throws InterruptedException
	{
		fuel.click();
		 Thread.sleep(2000);
	}
	public void clickVarient() throws InterruptedException
	{
		variant.click();
		 Thread.sleep(4000);
	}
	public void EnterAnyName() throws InterruptedException, IOException
	{
		name.sendKeys(Excel.getcelldata("Sheet1", 1, 2));
		Thread.sleep(2000);
	}
	public void IncorrectEmail() throws IOException, InterruptedException {
		errorEmail.sendKeys(Excel.getcelldata("Sheet1", 1, 3));
		 Thread.sleep(2000);
	}
	public void CorrectEmail() throws InterruptedException, IOException
	{
		errorEmail.sendKeys(Excel.getcelldata("Sheet1", 1, 4));
		 Thread.sleep(2000);
	}
	public void PrintErrorMessage() throws IOException, InterruptedException {
		System.out.println(errorNo.getText());
		 Thread.sleep(2000);
		 Excel.setcelldata("Sheet1",errorNo.getText() , 2, 0);
		
	}
	public void mobinum() throws InterruptedException {
		mobilenumber.sendKeys("9954365345");
		Thread.sleep(2000);
	}
	public void clickEnterButton() throws InterruptedException {
		viewprices.click();
		Thread.sleep(6000);
	}
	public void deliverydetails() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(sevendays).perform();
		act.click().perform();
		Thread.sleep(2000);
	}
	public void showroomprice() {
		exshowroomprice.sendKeys("750000");
	}
	public void submitbtn() throws InterruptedException {
		submitbtn.click();
		Thread.sleep(5000);
	}
	public void firstquote() {
		insurance.click();
	}
	public void quotes() throws InterruptedException, IOException {
		List<String> quotes = new ArrayList<String>();
			   quotes.add(quote.getText());
			   Excel.setcelldata("Sheet1",quote.getText() , 3, 0);
			   System.out.println(quotes);
			   Thread.sleep(1000);
		
	}
	}
