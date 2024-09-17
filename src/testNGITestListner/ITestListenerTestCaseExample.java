package testNGITestListner;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITestListenerTestCaseExample 
{
	
	int i;
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In Before Test");
	}
	
	//passing test	
	@Test
	public void myTest1()
	{
		System.out.println("In my test ONE method");
	}
	
	//failing test
	@Test
	public void myTest2()
	{
		System.out.println("In my test TWO method");
		assertTrue(false);
	}
	
	//skipping test
	@Test
	public void myTest3()
	{
		System.out.println("In my test THREE method");
		throw new SkipException("my test three is skipped");
	}
	
	//on test finish but success percentage
	@Test(successPercentage = 80 , invocationCount = 5)
	public void myTest4()
	{
		i++;
		System.out.println("My test FOUR method, invocation count is :" + i);
		
		if(i==1 | i ==2)
		{
			System.out.println("Fail my test Four");
			assertTrue(false);
		}
		else
		{
			System.out.println("Pass my test Four");
			assertTrue(true);
		}
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test");
	}


}
