package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	@BeforeSuite
	public void myBeforeSuite() {
		System.out.println("starting selenium drivers");
	}

	@AfterSuite
	public void myAfterSuite() {
		System.out.println("stopping selenium drivers");

	}
	
	@BeforeTest
	public void myBeforeTest() {
		System.out.println("starting before test");
	}

	@AfterTest
	public void myAfterTest() {
		System.out.println("stopping after test");

	}
}
