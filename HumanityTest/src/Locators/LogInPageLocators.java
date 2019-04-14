package Locators;

import org.openqa.selenium.By;

public class LogInPageLocators {

	public static final By email = By.xpath("//*[@id=\"email\"]");
	public static final By pass = By.xpath("//*[@id=\"password\"]");
	public static final By login = By.xpath("//*[@name=\"login\"]");
	public static final By welcome = By.xpath("//span[contains(text(),'Welcome to Humanity!')]");
	public static final By loginerror = By.xpath("//div[@class='response-message']");

	
	

	
}



