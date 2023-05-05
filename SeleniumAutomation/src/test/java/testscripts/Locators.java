package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tops");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		//driver.findElement(By.partialLinkText("American")).click();
		
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
	}
}
