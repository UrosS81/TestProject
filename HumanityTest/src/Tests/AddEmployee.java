package Tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.BaseClass;
import Locators.AddStuffPageLocators;
import Locators.HomePageLocators;
import Locators.LogInPageLocators;
import Locators.StuffPageLocators;

public class AddEmployee extends BaseClass




{

	@BeforeClass
	public static void LogIn()
	{
				
		driver.findElement(LogInPageLocators.email).sendKeys("stanojlovicu@gmail.com");	
		driver.findElement(LogInPageLocators.pass).sendKeys("sifra123");		
		driver.findElement(LogInPageLocators.login).click();	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.welcome)); 	
		driver.findElement(HomePageLocators.stuff).click();
		driver.findElement(StuffPageLocators.addemployee).click();	
		
		

	}
	
	
	@Test
	public void AddEmployees() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.firstName)); 	
		driver.findElement(AddStuffPageLocators.firstName).sendKeys("Bosko");	
		driver.findElement(AddStuffPageLocators.lastName).sendKeys("Simic");
		driver.findElement(AddStuffPageLocators.stuffEmail).sendKeys("bosko@simic.rs");	
		driver.findElement(AddStuffPageLocators.save).click();	
		WebDriverWait wait1 = new WebDriverWait(driver, 10); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.saved)); 
		
	
		//1 employee saved!

		


		
	}

		
	@Test
	public void AddEmployeeNoFirstName() {

		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.firstName)); 	
		driver.findElement(AddStuffPageLocators.lastName).sendKeys("Simic");
		driver.findElement(AddStuffPageLocators.stuffEmail).sendKeys("bosko@simic.rs");	
		driver.findElement(AddStuffPageLocators.save).click();	
		WebDriverWait wait1 = new WebDriverWait(driver, 10); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.notsaved)); 
		
		//'First Name cannot be left empty'
		
		}
	
	@Test
	public void AddEmployeeNoLastName() {

		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.firstName)); 		
		driver.findElement(AddStuffPageLocators.firstName).sendKeys("Bosko");	
		driver.findElement(AddStuffPageLocators.stuffEmail).sendKeys("simic@vosko.rs");	
		driver.findElement(AddStuffPageLocators.save).click();	
		WebDriverWait wait1 = new WebDriverWait(driver, 10); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.saved)); 
		
		
	
		
		//1 employee saved!

		
		}
	
	@Test
	public void AddEmployeeNoEmail() {

		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.firstName)); 	
		driver.findElement(AddStuffPageLocators.firstName).sendKeys("Bosko");	
		driver.findElement(AddStuffPageLocators.save).click();	
		WebDriverWait wait1 = new WebDriverWait(driver, 10); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(AddStuffPageLocators.saved)); 
		
		//1 employee saved!

		
		}
	
	
	
	
}
