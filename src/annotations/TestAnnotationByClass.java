package annotations;

import org.testng.annotations.Test;

import base.TestBase;

public class TestAnnotationByClass extends TestBase{
  
  @Test
  public void myTest() 
  {
	  System.out.println("I am in test");
  }
}
