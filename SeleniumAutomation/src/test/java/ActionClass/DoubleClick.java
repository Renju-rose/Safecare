package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("iframeResult");
			
			WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		    field1.clear();
			field1.sendKeys("welcome");
			
			WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			Actions act=new Actions(driver);
			act.doubleClick(button).build().perform();
            
			WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
			String copiedtext=field2.getAttribute("value");
			System.out.println(copiedtext);
			
			if(copiedtext.equals("welcome"))
			{
				System.out.println("doubleclciked");
			}
	}

}
