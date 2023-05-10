package Teastng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_verificationon_assertclass_disadvantage {
@Test
public void test()
{
	String expResult="good morning";
	String actResult="good night";
	boolean result=false;
Assert.assertNotEquals(actResult, expResult,"verification 1:act & exp result is same");
Assert.assertEquals(actResult, expResult,"verification 2:act & exp result is different");
Assert.assertTrue(result,"verification 3:result is false");

}


}
