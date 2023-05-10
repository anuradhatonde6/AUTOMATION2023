package Teastng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void TC4()
	{
		Reporter.log("running test case4",true);
	}
	@Test
	public void TC5()
	{
		Reporter.log("running test case5",true);
	}
	@Test
	public void TC6()
	{
		//Assert.fail();
		Reporter.log("running test case6",true);
	}
	@Test
	public void TC7()
	{
		Reporter.log("running test case7",true);
	}
}
