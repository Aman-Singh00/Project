package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);
		
		
		String text = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		
		System.out.println(text);
		
		
				
		
		
		
	}

}
