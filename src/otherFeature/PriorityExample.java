package otherFeature;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)
	public void testOneMethod() {
		System.out.println("This is test one method!!");
	}

	@Test(priority = 1)
	public void testTwoMethod() {
		System.out.println("This is test two method!!");
	}

	@Test(priority = 2)
	public void testThreeMethod() {
		System.out.println("This is test three method!!");
	}

}
