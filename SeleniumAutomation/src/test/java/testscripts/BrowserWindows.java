package testscripts;

import java.time.Duration;
 
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
            Set<String> windids=driver.getWindowHandles();
            
            //approach1
           /* List<String> windlist=new ArrayList(windids);
            
            String parentid=windlist.get(0);
            String childtid=windlist.get(1);
            
            driver.switchTo().window(childtid);
            driver.findElement(By.linkText("Contact Sales")).click();
            driver.switchTo().window(parentid);
			driver.findElement(By.name("username")).sendKeys("admin");*/
            
			//approach2
			//1-x,2-y,3-z
			
			for(String id:windids)
			{
				String title=driver.switchTo().window(id).getTitle();
				
				if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
				{
					driver.findElement(By.linkText("Contact Sales")).click();
					
				}
			}
			
			//closing specific window based on choice
		/*	if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")||(title.equals("z")))
			{
				driver.close();
			}*/
			
            
	}

}
