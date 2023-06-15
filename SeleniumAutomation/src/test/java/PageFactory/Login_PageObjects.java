package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageObjects {
	 WebDriver driver;	
		
	//constructors
		
	 Login_PageObjects(WebDriver driver)
		  {
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		  }
	 
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
	WebElement img_Logo;
	
	@FindBy(name="username")
	WebElement username_field;
	
	@FindBy(name="password")
	WebElement password_field;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement login_Button;
	
	
	
	//action methods
	
		public void setUsername(String username)
		{
			username_field.sendKeys(username);
		}
		public void setPassword(String password)
		{
			password_field.sendKeys(password);
		}
		public void clickLoginButton()
		{
			login_Button.click();
		}
		public boolean checkLogoPresence()
		{
			boolean status=img_Logo.isDisplayed();
			System.out.println(status);
			return status;
			
		}
}
