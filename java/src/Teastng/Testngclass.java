package Teastng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngclass {
	@Test
	public void test()
	{
System.out.println("running test method");		
Reporter.log("running test method", false);
Reporter.log("running test method", true);
	}
	
}
