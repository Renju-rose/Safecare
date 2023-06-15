package PageFactory;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class Login2_Test  {
		
		WebDriver driver;
		Login_PageObjects lp;
		@BeforeClass
		void setup()
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
		@Test(priority=1)
		void checkLogo() throws InterruptedException
		{
			lp=new Login_PageObjects(driver);
			Thread.sleep(3000);
			Assert.assertEquals(lp.checkLogoPresence(),true);
		}
		@Test(priority = 2)
		void test_Login() throws InterruptedException
		{
			lp.setUsername("Admin");
			lp.setPassword("admin123");
			lp.clickLoginButton();
			Thread.sleep(3000);
			Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		}
		@AfterClass
		void test_Logout()
		{
			driver.quit();
		}

	}



