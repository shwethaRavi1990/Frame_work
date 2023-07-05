package Runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_script.Base_script;
import Pom_script.Pom;

public class Test_runner extends Base_script
{


	@Test(dataProvider = "testData")
	public void test(String d1,String d2) throws InterruptedException
	{
		Pom p=new Pom(driver);
		p.passun(d1);
		p.passpwd(d2);
		Thread.sleep(2000);
		Assert.fail();
		}
	@DataProvider(name="testData")
	public Object[][] createData()
	{
		return new Object[][]
				{
			{"credic","admin"},
			{"anne","manager"},
				};
	}

}
