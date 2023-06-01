package ActionClass;

import java.time.Duration;import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement minimumSlider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println(minimumSlider.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(minimumSlider, 100, 250).build().perform();
		System.out.println("After moving minimum lsider" +minimumSlider.getLocation());
		
		WebElement maximumSlider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println(maximumSlider.getLocation());
		act.dragAndDropBy(maximumSlider, -300, 250).build().perform();
		System.out.println("After moving maximum slider"+maximumSlider.getLocation());
	}

}
