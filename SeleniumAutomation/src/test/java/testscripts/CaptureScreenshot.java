package testscripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException, Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        //project//new//folder//Screenshots
       // File target=new File("C:\\Users\\RR-2074\\eclipse-workspace\\SeleniumAutomation\\Screenshots\\fullpage.png");
        //fileUtils
        //FileUtils.copyFile(src, target);
        
        //specific area
        Thread.sleep(5000);
        WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
        File src1=featuredproducts.getScreenshotAs(OutputType.FILE);
        File target1=new File("C:\\Users\\RR-2074\\eclipse-workspace\\SeleniumAutomation\\Screenshots\\specificarea.png");
        FileUtils.copyFile(src1, target1);
        
        
        //logo
        Thread.sleep(5000);
        WebElement logo=driver.findElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']"));
        File src2=logo.getScreenshotAs(OutputType.FILE);
        File target2=new File("C:\\Users\\RR-2074\\eclipse-workspace\\SeleniumAutomation\\Screenshots\\logo.png");
        FileUtils.copyFile(src2, target2);
        
	}

}
