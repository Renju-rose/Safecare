package TestNGAnnotations;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		
	if(br.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(br.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
}
	@Test(priority = 1)
	void testlogo()
	{
		try
		{
			boolean status=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
			Assert.assertTrue(status);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	@Test(priority = 2)
	void testTitle()
	{
		String actual_title=driver.getTitle();
		Assert.assertEquals(actual_title,"OrangeHRM");
	}
	@AfterClass
	void closeApp()
	{
		driver.quit();
	}

}
