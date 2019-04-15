package Locators;

import org.openqa.selenium.By;

public class AddStuffPageLocators {
	
	public static final By firstName = By.xpath("//*[@id=\"_asf1\"]");
	public static final By lastName = By.xpath("//*[@id=\"_asl1\"]");
	public static final By stuffEmail = By.xpath("//*[@id=\"_ase1\"]");
	public static final By save = By.xpath("//*[@id=\"_as_save_multiple\"]");
	public static final By saved = By.xpath("//div[contains(text(),'1 employee saved!')]");
	public static final By notsaved = By.xpath("//div[contains(text(),'First Name cannot be left empty')]");


	



}
