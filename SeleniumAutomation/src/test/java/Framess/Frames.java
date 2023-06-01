package Framess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		    WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			driver.manage().window().maximize();
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("org.openqa.selenium")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("WebElement")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("classFrame");
			driver.findElement(By.linkText("Class")).click();
		
			

	}

}
