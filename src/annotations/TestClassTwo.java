package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class TestClassTwo extends TestBase{
	@BeforeClass
	public void myBeforeClassMethod() {
		System.out.println("I am in Before Class");
	}

	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println("I am in Before Method");
	}

	@Test
	public void tesClassTwo() {
		System.out.println("I am in Test Class Two");
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
