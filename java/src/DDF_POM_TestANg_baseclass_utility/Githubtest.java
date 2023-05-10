package DDF_POM_TestANg_baseclass_utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Githubtest extends Baseclass{
	Git_hub_signin signin;
	Github_login login;
	Github_Home home;
	Github_signout signout;
	@BeforeClass
	public void browserOpen() throws IOException, InterruptedException
	{
		openBrowser();
		signin=new Git_hub_signin(driver);
		login=new Github_login(driver);
		home=new Github_Home(driver);
		signout=new Github_signout(driver);
	}
	@BeforeMethod
  public void login() throws EncryptedDocumentException, IOException, InterruptedException
  {
  signin.click_Github_signin_btn();
  login.setGithubloginusername(Utility.getTestData(0, 0));
  login.setGithubloginpassword(Utility.getTestData(0, 1));
  login.clickGithuboginbtn();
  Thread.sleep(2000);
  home.clickGithubhomelogoutbtn();
  }
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		String expResult=Utility.getTestData(0, 2);
		String actResult=home.verifyGithubHomepageUserName();
		Assert.assertEquals(actResult, expResult,"act & exp result is different");
		
	}
	@AfterMethod
	public void logOut(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			int TCID=100;
			Utility.captureScreenshot(driver, TCID);
		}
		signout.clickGithubSignOutbtn();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
