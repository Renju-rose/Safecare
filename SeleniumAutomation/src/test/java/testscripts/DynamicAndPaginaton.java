package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAndPaginaton {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='accordion-button']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
        
        
        String text=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
        //Showing 1 to 10 of 12644 (1265 Pages)
        int total_pages=Integer.parseInt(text.substring(text.indexOf('(')+1,text.indexOf("Pages")-1));
        
        for(int p=1;p<=total_pages;p++)
        {
        	WebElement active_pages=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[1]/ul/li["+p+"]"));
        	//active_pages.click();
        	
        	List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr"));
        	
        			for(int r=1;r<=rows.size();r++)
        			{
        				String text1=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText();
        				System.out.println(text1);
        			}
        }
	

	}
}