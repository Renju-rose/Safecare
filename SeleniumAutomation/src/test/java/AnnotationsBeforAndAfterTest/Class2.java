package AnnotationsBeforAndAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test(priority = 2)
	void xyz()
	{
		System.out.println("xyz of class1");
	}
	@AfterTest
	void at()
	{
		System.out.println("Test is over");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Test has started");
	}

}
