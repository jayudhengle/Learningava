package groupingFeatures;

import org.testng.annotations.Test;

public class GroupingExample 
{
	@Test(groups= {"Breakfast", "Lunch"})
	public void myTestA()
	{
		System.out.println(" I am eating bread");
	}
	
	@Test(groups= "Breakfast")
	public void myTestB()
	{
		System.out.println(" I am eating butter");
	}
	
	@Test(groups= "Lunch")
	public void myTestC()
	{
		System.out.println(" I am eating pizza");
	}
	
	@Test(groups= "Lunch")
	public void myTestD()
	{
		System.out.println(" I am eating chicken");
	}
	
	@Test(groups= "Dinner")
	public void myTestE()
	{
		System.out.println(" I am eating snacks");
	}
	
	@Test(groups= "Dinner")
	public void myTestF()
	{
		System.out.println(" I am drinking tea");
	}
}
