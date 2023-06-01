package AnnotationsBeforAndAfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class1 {
	@Test (priority = 1)
	void abc()
	{
		System.out.println("abc of class1");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("After Suite");
	}

}
