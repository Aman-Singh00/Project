package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phonepay {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.phonepe.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(10000);
		jse.executeScript("window.scrollTo(0,2500)");
		
		
		}
	
	
	
}
