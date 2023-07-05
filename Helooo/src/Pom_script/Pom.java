package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic_script.Pom_basepage;

public class Pom extends Pom_basepage
{
		@FindBy(id="email")
		private WebElement unfield;
		@FindBy(id="pass")
		private WebElement pwdfield;
		@FindBy(name="Login")
		private WebElement loginbttn;


		public  Pom(WebDriver driver)
		{
			super(driver);
		}
		public void passun(String un)
		{
			unfield.sendKeys(un);
		}
		public void passpwd(String pwd)
		{
			pwdfield.sendKeys(pwd);
		}
		public void bttn()
		{
			loginbttn.click();
		}
		

}
