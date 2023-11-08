package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetRect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		
//		Rectangle location = button.getRect();
//		int Y = location.getY();
		
		//typecasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,200);");
//		Thread.sleep(5000);
//		jse.executeScript("window.scrollBy(0,500);");
		
//		jse.executeScript("window.scrollTo(0,"+Y+");");
//		Thread.sleep(5000);
//		jse.executeScript("window.scrollTo(0,300);");
		
		
		
//		scroll into view
		jse.executeScript("arguments[0].scrollIntoView(false)", button);
		
		
	}

}
