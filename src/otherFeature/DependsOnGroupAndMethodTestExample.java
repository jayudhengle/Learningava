package otherFeature;

import org.testng.annotations.Test;

public class DependsOnGroupAndMethodTestExample {

	@Test(dependsOnGroups = "Group1")
	public void myTestA() {

		System.out.println("In myTest A");
		//assertTrue(false);
	}

	@Test(groups = "Group1")
	public void myTestB() {

		System.out.println("In myTest B");
		//assertTrue(false);
	}

	@Test(groups = "Group1", dependsOnMethods = "myTestD")
	public void myTestC() {

		System.out.println("In myTest C");
	}
	
	@Test
	public void myTestD() {

		System.out.println("In myTest D");
	}

}
