package Generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_basepage 
{
	public WebDriver driver;
	public Pom_basepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
