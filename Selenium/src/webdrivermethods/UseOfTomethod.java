package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfTomethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// instatniate the browser
		WebDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();
		
//		//use of to(String url)
//		driver.navigate().to("https://www.amazon.in/");
		
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.quit();
	}

}
