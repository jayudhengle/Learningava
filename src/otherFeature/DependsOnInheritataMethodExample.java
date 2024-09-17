package otherFeature;

import org.testng.annotations.Test;

public class DependsOnInheritataMethodExample extends ParentClassExample
{
	@Test(dependsOnMethods = "myTestE")
	public void myTestA() {
		System.out.println("In myTest A");
	}

	@Test
	public void myTestB() {
		System.out.println("In myTest B");
	}

}
