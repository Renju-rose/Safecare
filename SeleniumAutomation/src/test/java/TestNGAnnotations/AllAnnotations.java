package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
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
	@Test(priority = 1)
	void test1()
	{
		System.out.println("test method1");
	}
	@Test(priority = 2)
	void test2()
	{
		System.out.println("test method2");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void am()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	void ac()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	void at()
	{
		System.out.println("After Test");
	}


}
