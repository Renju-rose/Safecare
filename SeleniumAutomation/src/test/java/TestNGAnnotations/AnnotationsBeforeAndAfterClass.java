package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsBeforeAndAfterClass {
	@BeforeClass
	void login()
	{
		System.out.println("login successfully");
	}
	@Test(priority = 1)
	void search()
	{
		System.out.println("search method");
	}
	@Test(priority = 2)
	void advnacedSearch()
	{
		System.out.println("Advanced Search");
	}
	@AfterClass
	void logout()
	{
		System.out.println("logout successfully");
	}


}
