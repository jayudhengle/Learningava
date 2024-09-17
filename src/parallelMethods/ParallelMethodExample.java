package parallelMethods;

import org.testng.annotations.Test;

public class ParallelMethodExample 
{
	@Test
	public void testCase1() 
	{
		System.out.println("Running test case one with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase2() 
	{
		System.out.println("Running test case two with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase3() 
	{
		System.out.println("Running test case three with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase4() 
	{
		System.out.println("Running test case four with thread id: "+ Thread.currentThread().getId());
	}

}
