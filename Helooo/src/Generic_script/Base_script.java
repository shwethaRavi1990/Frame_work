package Generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_script  implements Framewrk_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty(chrome_key, chrome_value);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		
		driver.close();
		
	}

}
