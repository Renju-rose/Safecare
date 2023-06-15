package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_PageObjects {
 WebDriver driver;	
	
//constructors
	
 Login_PageObjects(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  
//locators
	
	By img_logo=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	By username_field=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By password_field=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By login_Button=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
//action methods
	
	void setUsername(String username)
	{
		driver.findElement(username_field).sendKeys(username);
	}
	void setPassword(String password)
	{
		driver.findElement(password_field).sendKeys(password);
	}
	void clickLoginButton()
	{
		driver.findElement(login_Button).click();
	}
	boolean checkLogoPresence()
	{
		boolean status=driver.findElement(img_logo).isDisplayed();
		System.out.println(status);
		return status;
		
	}
		
}
