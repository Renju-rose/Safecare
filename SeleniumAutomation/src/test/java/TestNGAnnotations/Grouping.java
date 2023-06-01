package TestNGAnnotations;

import org.testng.annotations.Test;
/*
  login_Email-sanity & regression
  login_Facebook-sanity
  login_Twitter-sanity
  
  signup_Email-sanity & regression
  signup_Facebbok-regression
  signup_Twitter-regression
  
  payment_in_ruppes-sanity & regression
  payment_in_dollar-sanity
  payment_returnbybank-regression
 */
public class Grouping {
	@Test(priority = 1,groups= {"sanity,regression"})
	void login_Email()
	{
		System.out.println("Login by Email");
	}
	@Test(priority = 2,groups= {"sanity"})
	void login_Facebook()
	{
		System.out.println("Login by Facebook");
	}
	@Test(priority = 3,groups= {"sanity"})
	void login_Twitter()
	{
		System.out.println("Login by Twitter");
	}
	@Test(priority = 4,groups= {"sanity,regression"})
	void signup_Email()
	{
		System.out.println("Signup by Email");
	}
	@Test(priority = 5,groups= {"regression"})
	void signup_Facebook()
	{
		System.out.println("Signup by Facebook");
	}
	@Test(priority = 6,groups= {"regression"})
	void signup_Twitter()
	{
		System.out.println("Signup by Twitter");
	}
	@Test(priority = 7,groups= {"sanity,regression"})
	void payment_in_rupees()
	{
		System.out.println("payment_in_rupees");
	}
	@Test(priority = 8,groups= {"sanity"})
	void payment_in_dollar()
	{
		System.out.println("payment_in_dollar");
	}
	@Test(priority = 9,groups= {"regression"})
	void payment_returnbybank()
	{
		System.out.println("payment_returnbybank");
	}

}
