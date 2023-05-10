package Teastng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_verification_softassert {
	@Test
	public void test()
	{
		String expResult="good morning";
		String actResult="good night";
		boolean result=false;
		SoftAssert soft=new SoftAssert();
		soft.assertNotEquals(actResult,expResult,"verification1: act & exp result is equal ");
		soft.assertEquals(actResult,expResult,"verification2: act & exp result is not equal");
		soft.assertTrue(result,"verification3:result is false");
		soft.assertAll();
		
	}

}
