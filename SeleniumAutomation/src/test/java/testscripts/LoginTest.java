package testscripts;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {
	

	public static void main(String[] args) throws InterruptedException 
	{
	    //WebDriverManager.chromedriver().setup();
		//launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//username
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		//password
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		//submitbutton
		WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		String expected_title="OrangeHRM";
		String actual_title=driver.getTitle();
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		//driver.quit();
		
		
	}

}
