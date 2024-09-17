package annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardAssertion {
	
 SoftAssert sa;
  
  @Test
  public void testMethod1() 
  {
	  
	  sa = new SoftAssert();
	  sa.assertEquals(0, 0); 
	  
	  sa.assertAll();
  }
  
  @Test
  public void testMethod2() {
	  sa.assertEquals(1, 0); 
	  System.out.println("Hello");
	  sa.assertEquals(1, 1); 
	  
	  sa.assertAll();
  }
}
