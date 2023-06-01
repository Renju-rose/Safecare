package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ExcelUtils;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		String file=System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
		int total_rows=ExcelUtils.getRowCount(file,"Sheet1");
		System.out.println(total_rows);	
		
		for(int r=1;r<=total_rows;r++)
		{
			String username=ExcelUtils.getCellData(file,"Sheet1",r,0);
			String password=ExcelUtils.getCellData(file,"Sheet1",r,1);
			String text=null;
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    try
		    {
		    	text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
		    }
		    catch(NoSuchElementException e)
		    {
		    	text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		    	System.out.println(text);
		    }
		    
		    if(text.equals("Dashboard"))
		    {
		    	 System.out.println("Login Successfull");
		    	 ExcelUtils.setCellData(file, "Sheet1", r, 3, "PASSED");
		    	 ExcelUtils.fillGreenColor(file,"Sheet1",r,3);
		    }
		    else
		    {
		    	System.out.println("Login Failed");
		    	 ExcelUtils.setCellData(file, "Sheet1",r, 3, "FAILED");
		    	 ExcelUtils.fillRedColor(file,"Sheet1",r,3);
		    }
		    Thread.sleep(2000);
			
		}

	}

}
