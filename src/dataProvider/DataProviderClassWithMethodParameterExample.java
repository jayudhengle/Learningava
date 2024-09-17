package dataProvider;

import org.testng.annotations.Test;

public class DataProviderClassWithMethodParameterExample 
{
  @Test(dataProvider = "NumberInputs", dataProviderClass = MyDataProviderWithParameter.class)
  public void sumOfTwoNumberMethod1(int num1, int num2) 
  {
	  System.out.println("Entry of ssumOfTwoNumberMethod1");

	  int sum = num1 + num2;
	  System.out.println("Sum of two numbers is: " + sum);
	  
	  System.out.println("Exit from ssumOfTwoNumberMethod1");

  }
  
  @Test(dataProvider = "NumberInputs", dataProviderClass = MyDataProviderWithParameter.class)
  public void sumOfTwoNumberMethod2(int num1, int num2) 
  {
	  System.out.println("Entry of ssumOfTwoNumberMethod2");

	  int sum = num1 + num2;
	  System.out.println("Sum of two numbers is: " + sum);
	  
	  System.out.println("Exit from ssumOfTwoNumberMethod2");

  }
  
  
  
}
