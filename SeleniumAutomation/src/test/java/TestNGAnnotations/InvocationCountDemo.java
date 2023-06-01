package TestNGAnnotations;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount = 5)
	void test1()
	{
		System.out.println("testing.......");
	}
}
