package otherFeature;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsOnGroupTestExample {

	@Test(dependsOnGroups = "Group1")
	public void myTestA() {

		System.out.println("In myTest A");
		//assertTrue(false);
	}

	@Test(groups = "Group1")
	public void myTestB() {

		System.out.println("In myTest B");
		assertTrue(false);
	}

	@Test(groups = "Group1")
	public void myTestC() {

		System.out.println("In myTest C");
	}

}
