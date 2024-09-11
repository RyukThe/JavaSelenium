package AssignmentWingify;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WingifyTest extends BaseClass

{
	WingifyLoginPage login;
	WingifyHomePage home;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		initializeBrowser();
		login=new WingifyLoginPage(driver);
		home=new WingifyHomePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, IOException
	{
		
		login.inpWingifyLoginPageUN(UtilityClass.readDatafromPropertyFile("UN"));

		login.inpWingifyLoginPagePWD(UtilityClass.readDatafromPropertyFile("pass"));
		
		login.ClickWingifyLoginPagelofinbtn();
		
		Thread.sleep(2000);
	}
	@Test
	public void verifyAmount()
	{
		TCID=105;
		boolean sort = home.ClickWingifyHomePageAmount();
		Assert.assertTrue(sort,"Failed :Not Sorting");
	}
	
	@AfterMethod
	public void CaptureSS(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.capturess(driver, TCID);
			
		}
		
	}
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();

	}

}
