package Framework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver; 

	@BeforeClass
	public static void setupApplication()
	{
				
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.humanity.com/app/");	
		
	}

	@AfterClass
	public static void closeApplication()
	
	{
	
		driver.quit();

	}
}


 