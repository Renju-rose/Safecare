package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		List<WebElement> dropdownOptions=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
		System.out.println(dropdownOptions.size());
		for(WebElement op:dropdownOptions)
		{
			op.click();
		}
		for(WebElement op:dropdownOptions)
        {
        	System.out.println(op.getText());
        }

	}

}
