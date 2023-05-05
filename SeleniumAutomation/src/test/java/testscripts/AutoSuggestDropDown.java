package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		List<WebElement>options=driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		System.out.println(options.size());
		
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		
		
		for(WebElement op:options)
		{
			String element =op.getText();
			if(element.equals("selenium tutorial"))
			{
				op.click();
				break;
			}
		}
		

	}

}