package testscripts;

import java.time.Duration;
import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of Links: "+links.size());
		
		for(WebElement link:links)
		{
			String hrefvalue=link.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("href is null");
				continue;
		    }
			URL linkurl=new URL(hrefvalue);
			//open connection
			//connect to server
			
            HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
            conn.connect();
            
            if(conn.getResponseCode()>=400)
            {
            	System.out.println(hrefvalue+"             "+"Broken link");
            }
            else
            {
            	System.out.println(hrefvalue+"             "+"Normal link");
            }
	}

}
}

