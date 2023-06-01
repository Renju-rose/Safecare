package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElementsUsingJS {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement firstname=driver.findElement(By.name("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john');", firstname);
		
		//radiobutton
		WebElement female=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
		js.executeScript("arguments[0].click();", female);
		
		//checkbox
		WebElement sunday=driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
		js.executeScript("arguments[0].click();", sunday);

	}

}
