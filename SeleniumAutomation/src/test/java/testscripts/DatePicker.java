package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//approach1-picking from first listing calender
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/05/2023");
		
		
		//approach2-don't know the condition,in case of selecting future date or previous date
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String year="2024";
		String month="May";
		String date="20";
		
		while(true)
		{
			String month1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year1=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(month1.equals(month)&&(year1.equals(year)))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();//next arrow
		    }
		}
			List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
			for(WebElement dt:dates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
		
	}

}

