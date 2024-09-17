package annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample
{
		
	
	@Test
	public void testMethod() 
	{
		System.out.println("I am in test Method");
	}
	
	
	@Test
	public void testMethod2() 
	{
		System.out.println("I am in test Method2");
	}
	
	@BeforeMethod
	public void myBeforeMethod() 
	{
		System.out.println("I am in Before Method");
	}
	
	

}