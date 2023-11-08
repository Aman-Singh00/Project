package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/AMAN%20SINGH/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//a[@class='menu-toggle']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		
		
		
		
		
		
		
		
	}
	
}
