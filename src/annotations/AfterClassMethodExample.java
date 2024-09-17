package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterClassMethodExample {
  
	@BeforeClass
	public void myBeforeClassMethod() {
		System.out.println("I am in Before Class");
	}

	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println("I am in Before Method");
	}

	@Test
	public void testMethod() {
		System.out.println("I am in test Method");
	}

	@Test
	public void testMethod2() {
		System.out.println("I am in test Method2");
	}

	@AfterMethod
	public void myAfterMethod() {
		System.out.println("I am in After Method");
	}
	
	@AfterClass
	public void myAfterClassMethod() {
		System.out.println("I am in After Class");
	}

}
