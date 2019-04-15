package Tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.BaseClass;
import Locators.HomePageLocators;
import Locators.LogInPageLocators;
import Locators.TimeClockPageLocators;

public class ClockIn extends BaseClass {

	
	@BeforeClass
	public static void LogIn()
	{
				
		driver.findElement(LogInPageLocators.email).sendKeys("stanojlovicu@gmail.com");	
		driver.findElement(LogInPageLocators.pass).sendKeys("sifra123");		
		driver.findElement(LogInPageLocators.login).click();	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.welcome)); 	
		
	}
	
	

	@Test
	public void ClockInEmployee() {
	
	WebDriverWait wait = new WebDriverWait(driver, 10); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageLocators.timeclock)); 	
	driver.findElement(HomePageLocators.timeclock).click();
	driver.findElement(TimeClockPageLocators.clockin).click();
	WebDriverWait wait1 = new WebDriverWait(driver, 10); 
	wait1.until(ExpectedConditions.visibilityOfElementLocated(TimeClockPageLocators.clockedIn));
	
	
	

	
	
	//Clocked in.
	
	}

	@Test
	public void ClockOutEmployee() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(TimeClockPageLocators.clockout)); 	
		driver.findElement(HomePageLocators.timeclock).click();
		driver.findElement(TimeClockPageLocators.clockout).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(TimeClockPageLocators.clockedOut));
		
	
		//Clocked Out.
		
	}
}
