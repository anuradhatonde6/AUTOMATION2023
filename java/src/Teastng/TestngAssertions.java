package Teastng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAssertions {
@Test 
public void test1()
{
	Reporter.log("running test1 method", true);
	String expResult="good morning";
	String  actResult="good morning";	
   Assert.assertEquals(actResult, expResult,"act & exp result is not equal");	
}
@Test
public void test2()
{
 Reporter.log("running test2 method",true);
 String expResult="goood night";
 String actResult="good night1";
 Assert.assertNotEquals(actResult, expResult,"act & exp result is similar");
 }
@Test
public void test3()
{
 Reporter.log("running test3 method",true);
 boolean result=true;
 Assert.assertTrue(result,"result is false");
 }
@Test
public void test4()
{
 Reporter.log("running test4 method",true);
 boolean result=false;
 Assert.assertFalse(result,"result is true");
 }
@Test
public void test5()
{
 Reporter.log("running test5 method",true);
 String result=null;
 Assert.assertNull(result,"result is not null");
 }
@Test
public void test6()
{
 Reporter.log("running test6 method",true);
 String result="quantum";
 Assert.assertNotNull(result,"result is null");
 }
@Test
public void test7()
{
	Reporter.log("running test7 method",true);
	Assert.fail();
	}

 }



