package testscripts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthenticationPopup {

	public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		String actual=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		String expected="Congratulations! You must have the proper credentials.";
		
		if(actual.equals(expected))
		{
			System.out.println("signed in");
		}
		else
		{
			System.out.println("not signed");
		}
		
		
		//Alert alertwindow=driver.switchTo().alert();
		//alertwindow.sendKeys("hello");
	}

	}


