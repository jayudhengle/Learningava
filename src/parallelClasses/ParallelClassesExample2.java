package parallelClasses;

import org.testng.annotations.Test;

public class ParallelClassesExample2 
{
	@Test
	public void testCase5() 
	{
		System.out.println("Running test case five with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase8() 
	{
		System.out.println("Running test case eight with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase6() 
	{
		System.out.println("Running test case six with thread id: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase7() 
	{
		System.out.println("Running test case seven with thread id: "+ Thread.currentThread().getId());
	}

}
