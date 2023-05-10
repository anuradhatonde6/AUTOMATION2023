package Teastng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngkeywords {
	/*@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("running TC1");
	}*/
	@Test(priority=2 )
	public void TC2()
	{
		//Assert.fail();
		Reporter.log("running TC2",true);
	}
	@Test(priority=-1,dependsOnMethods = {"TC2"})
	public void TC3()
	{
		Reporter.log("running TC3",true);
	
	}
	@Test(priority=-1,enabled=false)
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	@Test(timeOut=3000,dependsOnMethods = {"TC3"})
	public void TC5() throws InterruptedException
	{
		Thread.sleep(4000);
	Reporter.log("running TC5", true);	
	}

}
