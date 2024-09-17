package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MyDataProviderWithParameter {
	@DataProvider(name = "NumberInputs")
	public Object[][] getDataFromDataProider(Method m) {
		
		if (m.getName().equalsIgnoreCase("sumOfTwoNumberMethod1"))
		{
			return new Object[][] { { 22, 33 }, { 12, 13 } };			
		}
		
		else
		{
			return new Object[][] { { 10, 20 }, { 40, 50 } };			
		}
	}

}
