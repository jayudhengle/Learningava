package otherFeature;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsOnSingleMethodExample {

	@Test(dependsOnMethods = "myTestB")
	public void myTestA() {

		System.out.println("In myTest A");
		//assertTrue(false);
	}

	@Test
	public void myTestB() {

		System.out.println("In myTest B");
		assertTrue(false);
	}

	@Test(dependsOnMethods = "myTestD")
	public void myTestC() {

		System.out.println("In myTest C");
		//assertTrue(false);
	}

	@Test
	public void myTestD() {

		System.out.println("In myTest D");
	}
}
