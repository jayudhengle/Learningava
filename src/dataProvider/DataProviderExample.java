package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{
  @Test(dataProvider = "NumberInputs")
  public void sumOfTwoNumber(int num1, int num2) 
  {
	  int sum = num1 + num2;
	  System.out.println("Sum of two numbers is: " + sum);
  }
  
  @DataProvider(name = "NumberInputs")
  public Object[][] getDataFromDataProider()
  {
	  return new Object[][]
			  {
				  {22,33}, 
				  {12,13}
			  };
  }
}
