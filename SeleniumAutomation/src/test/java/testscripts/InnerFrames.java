package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrames {

	public static void main(String[] args) {
		    WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
			driver.switchTo().frame(frame1);
			driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
			driver.switchTo().defaultContent();
			
			WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
			driver.switchTo().frame(frame3);
			driver.findElement(By.name("mytext3")).sendKeys("hi");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
			driver.switchTo().defaultContent();
			
			WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
			driver.switchTo().frame(frame2);
			driver.findElement(By.name("mytext2")).sendKeys("hi");
			driver.switchTo().defaultContent();
			
			WebElement frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
			driver.switchTo().frame(frame4);
			driver.findElement(By.name("mytext4")).sendKeys("hi");
			driver.switchTo().defaultContent();

	}

}
