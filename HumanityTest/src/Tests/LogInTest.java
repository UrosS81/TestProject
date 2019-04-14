package Tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.BaseClass;
import Locators.LogInPageLocators;

public class LogInTest extends BaseClass { 


	
	@Test
	public void LoginWrongEmail() {
		
		driver.findElement(LogInPageLocators.email).clear();
		driver.findElement(LogInPageLocators.pass).clear();
		driver.findElement(LogInPageLocators.email).sendKeys("stanojlovicu@gmail.co");	
		driver.findElement(LogInPageLocators.pass).sendKeys("sifra123");		
		driver.findElement(LogInPageLocators.login).click();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.loginerror)); 
		
		


	}
	
	@Test
	public void LoginWrongPassword() {

		driver.findElement(LogInPageLocators.email).clear();
		driver.findElement(LogInPageLocators.pass).clear();
		driver.findElement(LogInPageLocators.email).sendKeys("stanojlovicu@gmail.co");	
		driver.findElement(LogInPageLocators.pass).sendKeys("SIFRA123");		
		driver.findElement(LogInPageLocators.login).click();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.loginerror)); 
		
	}

	@Test
	public void LoginNoUserNameNoPassword() {
		
		driver.findElement(LogInPageLocators.email).clear();
		driver.findElement(LogInPageLocators.pass).clear();
		driver.findElement(LogInPageLocators.login).click();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.loginerror)); 
		
	
		
	}
	
	@Test
	public void LogInSuccess() {
	
		driver.findElement(LogInPageLocators.email).sendKeys("stanojlovicu@gmail.com");	
		driver.findElement(LogInPageLocators.pass).sendKeys("sifra123");		
		driver.findElement(LogInPageLocators.login).click();	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageLocators.welcome)); 
		
	}
	
}
	
