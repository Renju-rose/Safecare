package testscripts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsAndPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	//	Alert alertwindow=driver.switchTo().alert();
		//System.out.println(alertwindow.getText());
		//Thread.sleep(2000);
		//alertwindow.accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		Thread.sleep(2000);
		alertwindow.dismiss();
	}

}
