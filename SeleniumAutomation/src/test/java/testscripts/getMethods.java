package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      /*  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();*/
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
		driver.quit();
		
	}

}
