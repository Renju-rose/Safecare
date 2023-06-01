package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			driver.manage().window().maximize();
			
			//driver.switchTo().newWindow(WindowType.TAB);
			driver.switchTo().newWindow(WindowType.WINDOW);
			
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
			
			
			
	}

}
