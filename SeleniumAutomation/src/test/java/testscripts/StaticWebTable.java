package testscripts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr"));
		System.out.println("No. of Rows : "+rows.size());
		//int rows=rows.size();
		
		List<WebElement> columns=driver.findElements(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr[1]/th"));
		System.out.println("No. of columns : "+columns.size());
		//int columns=columns.size();
		
		//retrieve data
		String value=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(value);
		
		/*for(int r=2;r<=rows.size();r++)//r=2 as we are excluding header
		{
			for(int c=1;c<=columns.size();c++) {
				String value1=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value1);
		}
		System.out.println();
		
	}*/
	/* for(int r=2;r<=rows.size();r++)
	 {
	    String author=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr["+r+"]/td[2]")).getText();
	    if(author.equals("Amit"))
	    {
	     String bookname=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr["+r+"]/td[1]")).getText();
	     System.out.print(bookname);
	}
}     */
		int sum=0;
		for(int r=2;r<=rows.size();r++)
		{
			String price=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price);
		}
		System.out.println(sum);
}
}
