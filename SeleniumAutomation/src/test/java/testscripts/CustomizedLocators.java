package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//tag and id
	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Books");
	//tag and class
	driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Laptops");
	//tag ,attribute and value
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Mobiles");
	//tag ,class,attribute and value
	driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("Books");
	
	driver.findElement(By.cssSelector("button.search-box-button")).click();
	driver.quit();
	

}
}