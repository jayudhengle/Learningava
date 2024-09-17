package parallelTestMethod;

import org.testng.annotations.Test;

public class ParallelTestMethodExample 
{
	@Test(threadPoolSize = 4, invocationCount= 8)
	public void testCase()
	{
		System.out.println("Running test case with thread ID: " + Thread.currentThread().getId());
	}
	

}
