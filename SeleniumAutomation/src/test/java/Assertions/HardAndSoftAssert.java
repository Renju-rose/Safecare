package Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	
	@Test
	void test_hardassertions()
	{
		System.out.println("testing.......");
		System.out.println("testing.......");
		System.out.println("testing.......");
		System.out.println("testing.......");
		assertEquals(1,1);
		System.out.println("hard assertions");
		

	}
	@Test
	void test_softassertions()
	{
		System.out.println("testing.......");
		System.out.println("testing.......");
		System.out.println("testing.......");
		System.out.println("testing.......");
		SoftAssert sa=new SoftAssert();
	    sa.assertEquals(1, 1);
	    sa.assertAll();
		System.out.println("soft assertions");

	}

}
