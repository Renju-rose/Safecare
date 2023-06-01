package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exmaple {
	public static void main(String[] args) throws IOException, Throwable {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	
	
	
	WebElement support = driver.findElement(By.xpath("//a[text()='Support'][1]"));
	WebElement leanCntr = driver.findElement(By.xpath("//a[text()='Learning Center']"));
	Actions act=new Actions(driver);
	act.moveToElement(support).moveToElement(leanCntr).click();
	Thread.sleep(3000);
	act.perform();
	driver.navigate().back();
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement destination = driver.findElement(By.id("droppable"));
	Thread.sleep(3000);
	act.dragAndDrop(source, destination);
	Thread.sleep(3000);
	//action.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
	act.perform();

}
}