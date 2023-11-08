package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSubmitMethod {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
//		WebElement loginButton = driver.findElement(By.name("login"));
//		loginButton.submit();
		driver.findElement(By.xpath("//input[@value='2']")).submit();
		
		
	}

}
