package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		    WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().window().maximize();
			
			WebElement Rome=driver.findElement(By.id("box6"));
			WebElement Itlay=driver.findElement(By.id("box106"));
			Actions act=new Actions(driver);
			act.dragAndDrop(Rome, Itlay).build().perform();
			
			WebElement Washington=driver.findElement(By.id("box3"));
			WebElement UnitedStates=driver.findElement(By.id("box103"));
			act.dragAndDrop(Washington, UnitedStates).build().perform();

	}

}
