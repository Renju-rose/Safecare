package testscripts;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import java.util.*;

public class CheckBoxHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		//WebElement redColor=driver.findElement(By.xpath("//input[@value='red']"));
		//redColor.click();
		List<WebElement> allcolors=driver.findElements(By.name("color"));
		
		for(WebElement colors:allcolors)
		{
			String col=colors.getAttribute("value");
			if(col.equals("red")||col.equals("blue")||col.equals("purple"))
			{
				colors.click();
			}
			
		}
		

	}

}
