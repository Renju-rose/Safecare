package TestNGAnnotations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
WebDriver driver;
@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
	}
    @Test(dataProvider="dp")
	void login(String email,String password)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title="nopCommerce demo store";
		String actual_title=driver.getTitle();
		assertEquals(exp_title, actual_title);
	}
	@DataProvider(name="dp")
	String[][] data1()
	{
		String data[][]= {
				{"abc@gmail.com","test456"},
				{"xyz@gmail.com","test456"},
				{"abc@gmail.com","abc@456"},
				{"sree@gmail.com","test@123"},
			
		};
		return data;
	}
	void logout()
	{
		
	}
}
