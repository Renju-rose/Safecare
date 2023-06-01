package testscripts;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll by certain pixel
		js.executeScript("window.scrollBy(0,3000);", "");
		
		//to know pixel
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll till some element is found
		
		WebElement flagIndia=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		js.executeScript("arguments[0].scrollIntoView();", flagIndia);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//scroll to up
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}
