package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//instatniate the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.selenium.dev/");
		
		//navigate to another url
		driver.get("https://www.amazon.in/");
		
		//use of navigate
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//terminate the session
		driver.quit(); 
	}

}
