package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFireFlink {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/");
		String source_code = driver.getPageSource();
		System.out.println(source_code);
		
		driver.findElement(By.cssSelector("[placeholder='Enter your email']")).sendKeys("amansingh238623@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("Aman@12345");
		driver.findElement(By.className("primary-btn")).getDomAttribute(source_code);
		
		driver.quit();   
		
		
		
		
	}

}
