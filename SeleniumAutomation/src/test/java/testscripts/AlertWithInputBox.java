package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Alert alertwindow=driver.switchTo().alert();
	    Thread.sleep(5000);
		alertwindow.sendKeys("Hello,how are you?");
		Thread.sleep(2000);
		alertwindow.accept();
		
		String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expected="You entered: Hello,how are you?";
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
