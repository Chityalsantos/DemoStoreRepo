package SampleProject.SampleProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleDemo {

	@BeforeTest
	public void m1()
	{
		System.out.println("This is method 1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("This is methos 2");
	}
	
	@AfterTest
	public void m3()
	{
		System.out.println("This is method 3");
	}
}
