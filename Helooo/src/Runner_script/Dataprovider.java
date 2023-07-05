package Runner_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@Test(dataProvider = "testData")
	public void validtest(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}
	
	@DataProvider(name="testData")
	public Object[][] createData1()
	{
		return new Object[][]
				{
			{"cedic","admin"},
				{"anne","manager"},
			};
	}
}


