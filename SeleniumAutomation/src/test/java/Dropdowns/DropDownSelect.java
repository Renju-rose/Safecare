package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement dropdownCountry=driver.findElement(By.id("country-list"));
		
        Select drpdwn=new Select(dropdownCountry);
       // drpdwn.selectByVisibleText("France");
       // drpdwn.selectByIndex(2);
       // drpdwn.selectByValue("4");
        
        List<WebElement> options=drpdwn.getOptions();
        System.out.println(options.size());
        for(WebElement op:options)
        {
        	System.out.println(op.getText());
        }
	}


	}


