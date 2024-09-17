package otherFeature;

import org.testng.annotations.Test;

public class ParentClassExample {
	
	@Test(dependsOnMethods = "myTestF")
	public void myTestE() {
		System.out.println("In myTest E");
	}

	@Test
	public void myTestF() {
		System.out.println("In myTest F");
	}

}
